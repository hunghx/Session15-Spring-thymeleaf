package ra.springthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ra.springthymeleaf.model.entity.Category;
import ra.springthymeleaf.model.entity.Product;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
    // theo nameMethod
    boolean existsByProductName(String name);
    // dem so luong ba ghi
    long countByCategory(Category category);
    // truy van phuc tap van phai su dung sql bth
    @Query(value = "SELECT  * from products",nativeQuery = true) // JPQL or SQL
    List<Product> searchProductNameCustom();
}
