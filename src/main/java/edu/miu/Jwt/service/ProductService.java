package edu.miu.Jwt.service;

import edu.miu.Jwt.entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product p);

    void delete(Long id);

    Product getById(Long id);

    List<Product> getAll();
}
