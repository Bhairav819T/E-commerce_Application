package com.pro1.EcomApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro1.EcomApp.entity.Product;
import com.pro1.EcomApp.service.productservice;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class productcontroller {
	
	@Autowired
	private productservice ProductService;
	
	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		return ProductService.saveProduct(product);
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable String id) {
		return ProductService.getProductById(id);
	}
	
	@GetMapping("/all")
	public List<Product> findAll() {
		return ProductService.getProducts();
	}
	@PutMapping("/{id}")
	public Product updateProduct(@RequestBody Product product,@PathVariable String id) {
		return ProductService.updateProduct(product, id);
	}
	@DeleteMapping("/{id}")
	public boolean deleteProduct(@PathVariable String id) {
		return ProductService.deleteProduct(id);
	}

}
