package ra.springthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @RequestMapping({"/admin","/index.html"})
    public String index(Model model){
        model.addAttribute("viewName","index");
        return "layout/layout";
    }
    @RequestMapping({"/admin/category","/category.html"})
    public String category(Model model){
        model.addAttribute("viewName","category");
        return "layout/layout";
    }
    @RequestMapping({"/admin/product","/product.html"})
    public String product(Model model){
        model.addAttribute("viewName","product");
        return "layout/layout";
    }
    @RequestMapping({"/admin/user","/user.html"})
    public String user(Model model){
        model.addAttribute("viewName","user");
        return "layout/layout";
    }
}
