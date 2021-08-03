package com.example.TargetRetailSpringBoot;

import java.util.List;

public interface DetailsServiceInterface {
public List <Details> getProducts();
	
	public Details getProduct(long id);
	
	public Details put(long id, Details product);

	List<Details> getDetails();

	Details getDetails(long id);
}
