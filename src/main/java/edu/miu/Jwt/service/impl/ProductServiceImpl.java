package edu.miu.Jwt.service.impl;

import edu.miu.Jwt.entity.Product;
import edu.miu.Jwt.repository.ProductRepo;
import edu.miu.Jwt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public void save(Product p) {
        productRepo.save(p);
    }

    @Override
    public void delete(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public Product getById(Long id) {
        return productRepo.findById(id).get();
    }

    public List<Product> getAll() {
        List<Product>  result = new ArrayList<>();
        productRepo.findAll().forEach(result::add);
        return result;
    }

}
