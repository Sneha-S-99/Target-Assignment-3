package com.example.TargetRetailSpringBoot;

public class Details {
	private long id;
    private String name;
    private float price;
    private String type;
    private String channel;
    private float discount;
    private float discountedPrice;

    public Details(long id, String name, float price, String type, String channel, float discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.channel = channel;
        this.discount = discount;
        this.discountedPrice=this.price-(this.price*(this.discount/100));
    }
    

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
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
