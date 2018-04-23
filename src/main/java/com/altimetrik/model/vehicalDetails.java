package com.altimetrik.model;

import java.util.List;

import javax.persistence.EntityListeners;

import org.hibernate.annotations.Table;
import org.springframework.boot.actuate.audit.listener.AuditListener;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(appliesTo = "vehicaldetails")
@EntityListeners(AuditListener.class)
public class vehicalDetails {
	
	private String vehicalId;
	private String type;
	private String manufacture;
	private String model;
	private String year;
	private String engin;
	private String mileage;
	
	public List<?> getAllvehicalDetails(){
		
		return null;
		
	}
	
	public String getVehicalId() {
		return vehicalId;
	}
	public void setVehicalId(String vehicalId) {
		this.vehicalId = vehicalId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getEngin() {
		return engin;
	}
	public void setEngin(String engin) {
		this.engin = engin;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

}
