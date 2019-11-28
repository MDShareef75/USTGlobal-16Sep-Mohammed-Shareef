package com.ust.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //this should be of javax.persistance
@Table(name = "product") //same
public class Product {

	@Id
	@Column
	private int id;
	@Column
	private String pname;
	@Column	private int quantity;
	
	public int getPid() {
		return id;
	}
	public void setPid(int id) {
		this.id = id;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
