package ra.springthymeleaf.dao;

import ra.springthymeleaf.model.entity.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(Long id);
    void save(Product p);
    void deleteById(Long id);
}
