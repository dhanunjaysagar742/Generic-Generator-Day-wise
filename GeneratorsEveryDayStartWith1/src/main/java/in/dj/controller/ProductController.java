package in.dj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.dj.entities.Product;
import in.dj.repo.ProductRepo;

@RestController
@RequestMapping("/")
public class ProductController {

	@Autowired
	public ProductRepo productRepo;
	
	@PostMapping("save")
	public String saveProduct(@RequestBody Product product) {
		productRepo.save(product);
		return "ok";
	} 
	
}
