package ra.springthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.springthymeleaf.dao.ProductDao;
import ra.springthymeleaf.model.entity.Product;

import java.math.BigDecimal;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductDao productDao;
    @RequestMapping("/list")
    public String list(){
        for (Product p : productDao.findAll()){
            System.out.printf("ID : %s | Name : %s | CategoryName : %s \n",p.getProductId(),p.getProductName(),p.getCategory()==null?"null":p.getCategory().getCategoryName());
        }
        return "home";
    }
    @RequestMapping("/add")
    public String add(){
        Product p = new Product(null,"Quaanf 1", new BigDecimal("99.99"),null);
        Product p1 = new Product(null,"Quaanf 2", new BigDecimal("9.99"),null);
        productDao.save(p);
        productDao.save(p1);
        return "home";
    }

}
