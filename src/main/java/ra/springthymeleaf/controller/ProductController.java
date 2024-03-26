package ra.springthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.springthymeleaf.model.entity.Category;
import ra.springthymeleaf.model.entity.Product;
import ra.springthymeleaf.repository.IProductRepository;

import java.math.BigDecimal;


@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductRepository productRepository;

    @RequestMapping("/list")
    public String list(){
        for (Product p : productRepository.findAll()){
            System.out.printf(" %s | %s | %s \n",p.getProductId(),p.getProductName(), p.getCategory()==null?"null":p.getCategory().getCategoryName());
        }
        return "home";
    }
    @RequestMapping("/add")
    public String add(){
        Product p = new Product(null, "Quâaanfn 1", new BigDecimal("99.99"),new Category(null,"Quần"));
        productRepository.save(p);
        return "home";
    }

}
