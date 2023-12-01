package com.example.ProductServicer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController

	public class ProductService {
		@GetMapping(path="/saveProduct")
		public String saveProduct() {
			return "Products saved.";
		}
		@GetMapping(path="/getProduct")
		public String getProduct() {
			return "Products";
		}

	}


