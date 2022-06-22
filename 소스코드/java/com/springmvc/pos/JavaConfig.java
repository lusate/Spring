package com.springmvc.pos;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig {
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/spring5fs?characterEncoding=utf8&serverTimezone=UTC");
		ds.setUsername("spring5");
		ds.setPassword("spring5");
		ds.setInitialSize(2);
		ds.setMaxActive(10);
		ds.setTestWhileIdle(true);
		ds.setMinEvictableIdleTimeMillis(60000 * 3);
		ds.setTimeBetweenEvictionRunsMillis(10 * 1000);
		return ds;

	}
	
	@Bean(destroyMethod = "close")
	public DataSource dataSource1() {
		DataSource as = new DataSource();
		as.setDriverClassName("com.mysql.jdbc.Driver");
		as.setUrl("jdbc:mysql://localhost/product5fs?characterEncoding=utf8&serverTimezone=UTC");
		as.setUsername("product5");
		as.setPassword("product5");
		as.setInitialSize(2);
		as.setMaxActive(10);
		as.setTestWhileIdle(true);
		as.setMinEvictableIdleTimeMillis(60000 * 3);
		as.setTimeBetweenEvictionRunsMillis(10 * 1000);

		return as;
	}
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao(dataSource());
	}
	
	@Bean
	public ProductDao productDao() {
		return new ProductDao(dataSource1());
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}


}