package com.example.TargetRetailSpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DetailsService implements DetailsServiceInterface {
	List <Details> list;

    public DetailsService(){
    	list = new ArrayList<>();
            list.add(new Details(23453423, "ABC", 200 , "Own Brand", "Online Unique", 20));
            list.add(new Details(56782341, "DEF", 100 , "Own Brand", "Store only", 30));
            list.add(new Details(90563478, "XYZ", 800 , "External", "Online and store", 15));

    }
	@Override
	public List<Details> getDetails() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Details getDetails(long id) {
		
		Details p = null;
		for (Details details : list ) {
			if(details.getId()==id) {
				p = details;
				break;
			}
		}
		
		return p;
	}

	@Override
	public Details put(long id, Details det) {
		Details p = null;
		for (Details details : list ) {
			if(details.getId()==id) {
				p = details;
				break;
			}
		}
		p= det;

		
		return p;
	}
	@Override
	public List<Details> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Details getProduct(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
