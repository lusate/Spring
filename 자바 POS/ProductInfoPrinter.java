package skuniv.cs.spring;

import org.springframework.beans.factory.annotation.Autowired;


public class ProductInfoPrinter {

	@Autowired
	private ProductDao proDao;
	private ProductPrinter printer;

	public void setProductDao(ProductDao productDao) {
		this.proDao = productDao;
	}
	
	@Autowired
	public void setPrinter(ProductPrinter printer) {
		System.out.println("setPrinter: " + printer);
		this.printer = printer;
	}
	
	public void printProductInfo(String Code) {
		Product product = proDao.selectByCode(Code);
		if (product == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		System.out.println();
	}

}
