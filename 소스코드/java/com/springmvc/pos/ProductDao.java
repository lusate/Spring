package com.springmvc.pos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;


public class ProductDao {

	private JdbcTemplate jdbcTemplate;

	public ProductDao(DataSource dataSource1) {// dataSource2를 이용하여 jdbcTemplate 객체 구함
		this.jdbcTemplate = new JdbcTemplate(dataSource1);
	}
	
	public Product selectByName(String Name) {
		List<Product> results = jdbcTemplate.query(
				"select * from PRODUCT where NAME = ?",
				new RowMapper<Product>() {
					@Override
					public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
						Product product = new Product(
								rs.getString("NAME"),
								rs.getInt("COST"),
								rs.getInt("COUNT"),
								rs.getTimestamp("REGISTERDATE").toLocalDateTime());
						product.setCode(rs.getLong("CODE"));
						return product;
					}
				}, Name);

		return results.isEmpty() ? null : results.get(0);
	}
	

	public void insert(Product product) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				// 파라미터로 전달받은 Connection을 이용해서 PreparedStatement 생성
				PreparedStatement pstmt = con.prepareStatement(
						"insert into PRODUCT (NAME, COST, COUNT, REGISTERDATE) " +
						"values (?, ?, ?, ?)",
						new String[] { "CODE" });
				// 인덱스 파라미터 값 설정
				pstmt.setString(1, product.getName());
				pstmt.setInt(2, product.getCost());
				pstmt.setInt(3, product.getCount());
				pstmt.setTimestamp(4, Timestamp.valueOf(product.getregisterDate()));
				// 생성한 PreparedStatement 객체 리턴
				return pstmt;
			}
		}, keyHolder);
		Number keyValue = keyHolder.getKey();
		product.setCode(keyValue.longValue());
	}

	public void update(Product product) {
		jdbcTemplate.update(
				"update PRODUCT set COUNT = ?, COST = ? where NAME = ?",
				product.getCount(), product.getCost(), product.getName());
	}

	public List<Product> selectAll() {
		List<Product> results = jdbcTemplate.query("select * from PRODUCT",
				(ResultSet rs, int rowNum) -> {
					Product product = new Product(
							rs.getString("NAME"),
							rs.getInt("COST"),
							rs.getInt("COUNT"),
							rs.getTimestamp("REGISTERDATE").toLocalDateTime());
					product.setCode(rs.getLong("CODE"));
					return product;
				});
		return results;
	}

	public int count() {
		Integer count = jdbcTemplate.queryForObject("select count(*) from PRODUCT", Integer.class);
		return count;
	}

}
