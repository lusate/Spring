package com.springmvc.pos;

import java.time.LocalDateTime;

public class ProductRegistService {
	private ProductDao productDao;
	public ProductRegistService(ProductDao productDao) {
		this.productDao = productDao;
	}
	public Long regist(ProductRegist req) throws Exception {
		Product product = productDao.selectByName(req.getName());
		if (product != null) {
			throw new Exception("DuplicateProductException");
		}
		
		Product newProduct = new Product( req.getName(), req.getCost(), req.getCount(), LocalDateTime.now());
		productDao.insert(newProduct);
		return newProduct.getCode();
	}
}
