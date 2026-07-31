package com.fetchflipkart.api;

import com.product.api.ProductApi;

public class FetchApi {
	public static void main(String[] args) {
		ProductApi product = new ProductApi();
		product.productApi("washingmachine");
	}
}
