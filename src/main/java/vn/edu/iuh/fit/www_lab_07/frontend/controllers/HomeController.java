package vn.edu.iuh.fit.www_lab_07.frontend.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        return  "home";
    }
}
