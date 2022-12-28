package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetProduct {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
				
				Product product = new Product();
				product.setId(1);
				
				productService.getProduct(product);
			}
		}

