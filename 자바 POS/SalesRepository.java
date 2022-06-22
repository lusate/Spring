package skuniv.cs.spring;

import java.util.HashMap;


public class SalesRepository {
	public static HashMap<String, Sales> saleList = new HashMap<String, Sales>();
	
    
    public static void setsaleList() {
    	// Code, 하루, 일주일, 한달, 매출액
		saleList.put("ItemCode1", new Sales("ItemCode1", 50000, 350000, 1400000, 2800000));
		saleList.put("ItemCode2", new Sales("ItemCode2", 31200, 218400, 873600, 1747200));
		saleList.put("ItemCode3", new Sales("ItemCode3", 20700, 144900, 579600, 1159200));
		saleList.put("ItemCode4", new Sales("ItemCode4", 23400, 163800, 655200, 1310400));
    }
}
