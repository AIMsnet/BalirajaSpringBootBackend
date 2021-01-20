package com.baliraja.dto;

import java.sql.Date;

public class ProductDto {
	private String name;
	private Integer id;
	private Integer code;
	private String brand;
	private float price;
	private String arrival;
	private String unit;
	private Integer categoryId;
	private Date created_date;
	private Integer clicks;
	private Integer offer;
	
	public ProductDto(String name, Integer id, Integer code, String brand, float price, String arrival, String unit,
			Date created_date, Integer clicks,Integer offer) {
		super();
		this.name = name;
		this.id = id;
		this.code = code;
		this.brand = brand;
		this.price = price;
		this.arrival = arrival;
		this.unit = unit;
		this.created_date = created_date; 
		this.clicks = clicks;
		this.offer = offer;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the arrival
	 */
	public String getArrival() {
		return arrival;
	}

	/**
	 * @param arrival the arrival to set
	 */
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getUnit() {
		return unit;
	}

	
	public void setUnit(String unit) {
		this.unit = unit;
	}

	
	public Integer getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the created_date
	 */
	public Date getCreated_date() {
		return created_date;
	}

	/**
	 * @param created_date the created_date to set
	 */
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	/**
	 * @return the clicks
	 */
	public Integer getClicks() {
		return clicks;
	}

	/**
	 * @param clicks the clicks to set
	 */
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	/**
	 * @return the offer
	 */
	public Integer getOffer() {
		return offer;
	}

	/**
	 * @param offer the offer to set
	 */
	public void setOffer(Integer offer) {
		this.offer = offer;
	}
	
	
}
