package skuniv.cs.spring;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;


public class MemberRepository{
	@Autowired
	public static HashMap<String, Member> memberList = new HashMap<>();
    
    public static void memberList() {
		memberList.put("asdggw", new Member("asdggw", "1234"));
		memberList.put("driag", new Member("driag", "1234"));
		memberList.put("rayrayr", new Member("rayrayr", "1234"));
    }//ID, password, name
}


/*
public static HashMap<String, Product> productList = new HashMap<String, Product>();
@Autowired
private ProductDao productDao;

@Autowired
public ProductRepository(ProductDao productDao) {
	this.productDao = productDao;
}*/