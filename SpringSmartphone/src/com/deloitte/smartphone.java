package com.deloitte;
public class smartphone {
	String name;
	double price;
	application apps;
	
	public smartphone() {
		super();
	}
	public application getApps() {
		return apps;
	}
	public void setApps(application apps) {
		this.apps = apps;
	}
	public smartphone(application apps) {
		super();
		this.apps = apps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
