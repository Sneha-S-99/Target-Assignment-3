package com.example.TargetRetailSpringBoot;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@Autowired
	private DetailsService detailsService;
	
	@GetMapping(path="/products/{id}", produces="application/json")
	public Details getDetails(@PathVariable long id){
		return this.detailsService.getDetails(id);
	}
	@PutMapping(path="/products/{id}")
	public Details updateDetails(@RequestBody UpdateProductDetails details, @PathVariable long id) {
		Details storedDetails=this.detailsService.getDetails(id);
		storedDetails.setPrice(details.getPrice());
		storedDetails.setDiscountedPrice(details.getPrice()-(details.getPrice()*(details.getDiscount()/100)));
		return this.detailsService.put(id,storedDetails);
	}
}

