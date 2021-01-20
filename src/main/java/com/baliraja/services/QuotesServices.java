package com.baliraja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baliraja.dao.QuotesDao;
import com.baliraja.entity.Quotes;
import com.baliraja.entity.Suppliers;

@Service
public class QuotesServices {

	@Autowired
	QuotesDao quotesDao;
	
	@Autowired
	SupplierServices supplierService;

	public Iterable<Quotes> getAllQuotes(Quotes quotes) {
		return quotesDao.findAll();
	}
	
	public Optional<Quotes> getQuoteById(Integer id){
		return quotesDao.findById(id);
	}

	public Quotes saveQuotes(Quotes quotes) {
		return quotesDao.save(quotes);
	}
	
	public Quotes updateQuotes(Quotes quotes) {
		Optional<Quotes> q=quotesDao.findById(quotes.getId());
		Quotes q1=q.get();
		q1=quotes;
		return quotesDao.save(q1);
	}
	
	public List<Quotes> findBySuppliers(String sessionId) {
		Suppliers supplier = supplierService.getSupplierBySession(sessionId);
		List<Quotes> quotesList = quotesDao.findBySuppliers(supplier);
		return quotesList;
	}
	
}
