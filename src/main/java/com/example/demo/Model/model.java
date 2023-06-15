package com.example.demo.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class model {
	
	@Id
	private Integer id;
	private String FoodName;
	private String FoodCategory;
	private String HotelName;
	private String Description;
	private double Price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public String getFoodCategory() {
		return FoodCategory;
	}
	public void setFoodCategory(String foodCategory) {
		FoodCategory = foodCategory;
	}
	public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", FoodName=" + FoodName + ", FoodCategory=" + FoodCategory + ", HotelName="
				+ HotelName + ", Description=" + Description + ", Price=" + Price + "]";
	}
	public model(Integer id, String foodName, String foodCategory, String hotelName, String description, double price) {
		super();
		this.id = id;
		FoodName = foodName;
		FoodCategory = foodCategory;
		HotelName = hotelName;
		Description = description;
		Price = price;
	}
	public model() {
		super();
	}
	public static void save(model m) {
		
	}
	
		
}
	
	
	


