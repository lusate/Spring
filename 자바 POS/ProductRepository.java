package skuniv.cs.spring;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductRepository{
	@Autowired
	public static HashMap<String, Product> productList = new HashMap<String, Product>();
	private ProductDao productDao;
	
	@Autowired
	public ProductRepository(ProductDao productDao) {
		this.productDao = productDao;
	}
    
    public static void setProductList() {
    	//String Code, int Cost, Date registerDate, int Count
    	
		productList.put("ItemCode1", new Product("ItemCode1", 5000, "2022-05-01", 80));
		productList.put("ItemCode2", new Product("ItemCode2", 2400, "2022-05-01", 100));
		productList.put("ItemCode3", new Product("ItemCode3", 900, "2022-05-01", 90));
		productList.put("ItemCode4", new Product("ItemCode4", 1300, "2022-05-01", 100));
    }
}
