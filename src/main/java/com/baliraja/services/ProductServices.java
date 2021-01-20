package com.baliraja.services;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import com.baliraja.dao.ProductDao;
import com.baliraja.dto.ProductDto;
import com.baliraja.entity.Product;
import com.baliraja.entity.Suppliers;

@Transactional
@Service
public class ProductServices {
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	SupplierServices supplierService;
	
	
	
	public List<ProductDto> getAllProductBySeesionId(Integer businessId) {
		List<Product> productList = productDao.findByBusinessId(businessId);
		List<ProductDto> productDtoList = new ArrayList<ProductDto>();
		System.out.println("Produt Business List \n" + productList);
		for(int i = 0; i < productList.size(); i++) {
			Product p = productList.get(i);
			System.out.println("Brand "+ p.getBrand());
			productDtoList.add(new ProductDto(p.getName(), p.getId(),
					p.getCode(), p.getBrand(), p.getPrice(), p.getArrival(),
					p.getUnit(), p.getCreated_date(), p.getClicks(), p.getOffer()));
		}
		
		for(ProductDto p : productDtoList) {
			System.out.println("Name "+ p.getName());
		}
		return productDtoList;
	}
	
	
	public Optional<Product> getById(Integer id) {
		return productDao.findById(id);
	}
	
	public Iterable<Product> getAllProducts(Product product) {
		return productDao.findAll();
	}
	
	public Integer createProduct(String sessionId, Product product) {
		Integer id = 0;
		try {
			Suppliers supplier = supplierService.getSupplierBySession(sessionId);
			Integer businessId = supplier.getBusiness().get(0).getId();
			System.out.println("Business Id ->>>>>>>>>>>>>" + businessId);
			product.setBusinessId(businessId);
			product.setCreated_date(new Date(System.currentTimeMillis()));
			product.setUpdated_date(new Date(System.currentTimeMillis()));
			id = productDao.save(product).getId();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	public Product updateProduct(Product product) {
		Optional<Product> p=productDao.findById(product.getId());
		Product p1=p.get();
		p1=product;
		return productDao.save(p1);
	}
}
