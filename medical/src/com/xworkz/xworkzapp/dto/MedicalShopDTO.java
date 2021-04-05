package com.xworkz.xworkzapp;

public class MedicalShopDTO {

	private String shopName;
	private String address;
	private String shopOwnerName;
	private String manufactureDateOfTablet;
	private String expireyDateOfTablet;
	
	public MedicalShopDTO(String shopName, String address, String shopOwnerName, String manufactureDateOfTablet,
			String expireyDateOfTablet) {
		
		this.shopName = shopName;
		this.address = address;
		this.shopOwnerName = shopOwnerName;
		this.manufactureDateOfTablet = manufactureDateOfTablet;
		this.expireyDateOfTablet = expireyDateOfTablet;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopOwnerName() {
		return shopOwnerName;
	}

	public void setShopOwnerName(String shopOwnerName) {
		this.shopOwnerName = shopOwnerName;
	}

	public String getManufactureDateOfTablet() {
		return manufactureDateOfTablet;
	}

	public void setManufactureDateOfTablet(String manufactureDateOfTablet) {
		this.manufactureDateOfTablet = manufactureDateOfTablet;
	}

	public String getExpireyDateOfTablet() {
		return expireyDateOfTablet;
	}

	public void setExpireyDateOfTablet(String expireyDateOfTablet) {
		this.expireyDateOfTablet = expireyDateOfTablet;
	}
}
