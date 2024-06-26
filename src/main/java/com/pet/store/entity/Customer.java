package com.pet.store.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name="customer")
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private long id;
	//fist name
	@Column(name="firstname")
	private String firstname;
	//last name
	@Column(name="lastname")
	private String lastname;
	//dob
	@Column(name="dob")
	private String dob;
	//address
	@Column(name="address")
	private String address;
	//phone
	@Column(name="phone")
	private String phone;
	//username
	@Column(name="username")
	private String username;
	//password
	@Column(name="password")
	private String password;
	@CreationTimestamp
	@Column(name="date_created")
	private Date dateCreated;
	//time modify
	@UpdateTimestamp
	@Column(name="date_modified")
	private Date dateModified;
	
	@OneToMany(mappedBy="customer")
	private List<Cart> carts= new ArrayList<Cart>();
	
	@OneToMany(mappedBy="customer")
	private List<Order> orders = new ArrayList<Order>();
	
	public Customer( String firstname, String lastname, String dob, String address, String phone, String username,
			String password) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}
	
	
	public Customer() {
		super();
	}




	public List<Cart> getCarts() {
		return carts;
	}


	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	public Date getDateModified() {
		return dateModified;
	}


	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	
	
	
}
