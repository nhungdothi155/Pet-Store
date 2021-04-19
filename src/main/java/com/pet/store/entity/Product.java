package com.pet.store.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {
	
//id	
@Id
@GeneratedValue
@Column(name="product_id")
private long productId;
//seller
@ManyToOne
@JoinColumn(name="seller_id",nullable=false)
private Seller seller;
//category
@ManyToOne
@JoinColumn(name="category_id",nullable=false)
private Category category;
//name of product
@Column(name="product_name")
private String productName;
// the description of product
@Column(name="description")
private String description;
// the brand of product
@Column(name="brand")
private String brand;
// the material of product
@Column(name="material")
private String material;
// the origin of product
@Column(name="origin")
private String origin;
// the numbers of product are available
@Column(name="product_numbers")
private String productNumbers;
//the photos of product
@Column(name="photos")
private String photos;
// the state of product : new or used
@Column(name="product_state")
private State productState;
public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
}
public Seller getSeller() {
	return seller;
}
public void setSeller(Seller seller) {
	this.seller = seller;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public String getProductNumbers() {
	return productNumbers;
}
public void setProductNumbers(String productNumbers) {
	this.productNumbers = productNumbers;
}
public String getPhotos() {
	return photos;
}
public void setPhotos(String photos) {
	this.photos = photos;
}
public State getProductState() {
	return productState;
}
public void setProductState(State productState) {
	this.productState = productState;
}







}
// the state of a product : product has been used or it is new
enum State{
	NEW,USED
	
}
 