package com.app.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.pojos.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	public ProductController() {
		System.out.println("in constr of " + getClass().getName());
	}

	@GetMapping("/show")
	public @ResponseBody List<Product> showDetails() {
		System.out.println("in show");
		return Arrays.asList(new Product(1, "pr-1", new Date(), 100), new Product(2, "pr-2", new Date(), 200),
				new Product(3, "pr-3", new Date(), 300), new Product(4, "pr-4", new Date(), 400));
	}
	@GetMapping("/add/{id}/{name}/{dt}/{price}")
	public @ResponseBody Product addProduct
(@PathVariable int id,@PathVariable String name,
		@PathVariable @DateTimeFormat
		(pattern="yyyy-MM-dd") Date dt,
		@PathVariable double price)
	{
		System.out.println("in add product");
		return new Product(id, name, dt, price);
	}

}
