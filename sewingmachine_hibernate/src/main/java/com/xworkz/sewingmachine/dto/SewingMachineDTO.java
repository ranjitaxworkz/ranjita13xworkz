package com.xworkz.sewingmachine.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name = "sewing_machine")
@NamedQuery(name="GetAllRecords",query="from SewingMachineDTO")
@NamedQuery(name="GetMaxPriceOfSewingMachine",query="select max(price) from SewingMachineDTO")
@NamedQuery(name="GetminPriceOfSewingMachine",query="select min(price) from SewingMachineDTO")
@NamedQuery(name="GetAvgPrice",query="select min(price) from SewingMachineDTO")
@NamedQuery(name="GetTotalPriceOfAllRecords",query="select sum(price) from SewingMachineDTO")


public class SewingMachineDTO {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this annotaation is used for auto incriment
	@Id
	@Column (name = "MACHINE_ID")
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
    
	public SewingMachineDTO( String name, String model, double price, String color,
			boolean isWorking) {
		super();
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
