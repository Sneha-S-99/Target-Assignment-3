# Target-Assignment-3
Case study:
TargetRetail RESTful serviceThe goal for this exercise is to create an end-to-end Proof-of-Concept for a products API, which will aggregate product data and return it as JSON to the caller.
Your goal is to create a RESTful service that can retrieve product and price details by ID. The URL structure is up to you to define, but try to follow some sort of logical convention.
Build an application that performs the following actions:
* Responds to an HTTP GET request at /products/{id} and delivers product data as JSON (where {id} will be a number.
* Example product IDs: 15117729, 16483589, 16696652, 16752456, 15643793)
*  Accepts an HTTP PUT request at the same path (/products/{id}), containing a JSON request body similar to the GET response, and updates the product's price in the data store.Any Product contains following attributes:-
- Product ID
- Product Name
- Selling Price
- Product Type(could be Own-Brand or External)
- Selling channel(online unique, store only, online and store)
- Discount PrecentNote: Discounts could change frequently and the Price should be calculated accordingly.
