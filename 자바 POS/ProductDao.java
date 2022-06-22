package skuniv.cs.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class ProductDao {

	
	private Map<String, Product> map = new HashMap<>();

	public Product selectByCode(String Code) {
		return map.get(Code);
	}
	
	public Collection<Product> selectAll() {
		return map.values();
	
	}
}
