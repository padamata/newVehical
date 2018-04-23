package com.altimetrik.model;

import java.util.List;

public class Customer<E> {
	private List<E> type;
	private List<E> manufacture;
	private List<E> model;
	public List<E> getType() {
		return type;
	}
	public void setType(List<E> type) {
		this.type = type;
	}
	public List<E> getManufacture() {
		return manufacture;
	}
	public void setManufacture(List<E> manufacture) {
		this.manufacture = manufacture;
	}
	public List<E> getModel() {
		return model;
	}
	public void setModel(List<E> model) {
		this.model = model;
	}
	

}
