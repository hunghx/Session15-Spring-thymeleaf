package ra.springthymeleaf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.springthymeleaf.repository.IProductRepository;

@Controller
@RequiredArgsConstructor
public class HomeController {

//    @RequestMapping('')
//    public  String home(Model model){
//        model.addAttribute("name","Nguyễn Văn A");
//        model.addAttribute("age",20);
//        model.addAttribute("span","<span style=\"color: red\">Helo màu đỏ</span>");
//        model.addAttribute("numbers",new int[]{1,2,3,4,5,6,7});
//        model.addAttribute("student",new Student(1,19,"Nguyễn Văn B"));
//        return "home";
//    }
//    @RequestMapping(value = "/upload" ,method = RequestMethod.POST)
//    public String upload(Model model, @RequestParam MultipartFile file){
//        model.addAttribute("url",uploadService.uploadFileToServer(file));
//        return "upload";
//    }
}
