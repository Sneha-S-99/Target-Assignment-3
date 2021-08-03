package com.example.TargetRetailSpringBoot;

public class UpdateProductDetails {
	private float price;
    private float discount;
    private float discountedPrice;

	public UpdateProductDetails() {
		
	}
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(float discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

}
