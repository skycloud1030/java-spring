package com.example.demo;

import com.example.demo.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {
  @GetMapping("/products/{id}")
  public Product getProduct(@PathVariable("id") String id) {
    Product product = new Product();
    product.setId(id);
    product.setName("Romantic Story");
    product.setPrice(200);

    return product;
  }

  @GetMapping("/products")
  public Product getProduct() {
    Product product = new Product();
    product.setId("2");
    product.setName("Romantic Story");
    product.setPrice(200);

    return product;
  }
}
