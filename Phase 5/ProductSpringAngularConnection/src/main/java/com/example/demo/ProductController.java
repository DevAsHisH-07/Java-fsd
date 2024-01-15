package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
public class ProductController {
    @Autowired
    ProductRepo repo;

    // insert
    @PostMapping("/register")
    public String register(@RequestBody Product product) {
        repo.save(product);
        return "Hey " + product.getPname() + " registered successfully...!";
    }

    // list of Products
    @GetMapping("/getAllProducts")
    public List<Product> findAllProducts() {
        return repo.findAll();
    }

    // delete by id
    @DeleteMapping("/cancel/{id}")
    public List<Product> cancelRegistration(@PathVariable int id) {
        repo.deleteById(id);
        return repo.findAll();
    }

    // search via product id
    @GetMapping("/findbyProductId/{pid}")
    public List<Product> findProduct(@PathVariable int pid) {
        return repo.findByPid(pid);
    }

    // update
    @PostMapping("/update")
    public String update( @RequestBody Product updatedProduct) {
        Product existingProduct = repo.findById(updatedProduct.getPid()).orElse(null);

        if (existingProduct != null) {
            existingProduct.setPname(updatedProduct.getPname());
            existingProduct.setPcost(updatedProduct.getPcost());
            existingProduct.setOrderDate(updatedProduct.getOrderDate());
            repo.save(existingProduct);
            return "Product with id " + updatedProduct.getPid() + " updated successfully!";
        } else {
            return "Product with id " + updatedProduct.getPid() + " not found!";
        }
    }
}
