package com.xworkz.xworkzapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "sewing_machine")
public class SewingMachineDTO {

	@Column (name = "MACHINE_ID")
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY) // this annotaation is used for auto incriment

	private int sewingMachineId;
	
	@Column(name = "NAME")
    private String name;	
	
	@Column(name = "MODEL")
    private String model;
	
	@Column(name = "PRICE")
    private double price;
	
	@Column(name = "COLOR")
    private String color;
	
	@Column(name = "IS_WORKING")
     private boolean isWorking;
    
    public SewingMachineDTO() {
        System.out.println("Default constructor");
    }
	public SewingMachineDTO( int id,String name, String model, double price, String color,
			boolean isWorking) {
		super();
		this.sewingMachineId =id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.color = color;
		this.isWorking = isWorking;
	}
	public int getSewingMachineId() {
		return sewingMachineId;
	}
	public void setSewingMachineId(int sewingMachineId) {
		this.sewingMachineId = sewingMachineId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isWorking() {
		return isWorking;
	}
	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	
	@Override
	public String toString() {
		return "SewingMachineDTO [sewingMachineId=" + sewingMachineId + ", name=" + name + ", model=" + model
				+ ", price=" + price + ", color=" + color + ", isWorking=" + isWorking + "]";
	}
    
    
}
