package com.patel.autofind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication

public class DatabaseController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String viewUsers(Model model){
        model.addAttribute("listUsers", userService.getAllUsers());
                return "index";
    }
}
