package Informatyka.BankAlfa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){

        return "index";
    }

    @GetMapping("register.html")
    public String registerPage(){

        return "register";
    }

    @GetMapping("/login.html")
    public String loginPage(){

        return "login";
    }
}
