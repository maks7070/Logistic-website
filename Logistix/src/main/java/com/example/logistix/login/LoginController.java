package com.example.logistix.login;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController
{
    @GetMapping("/")
    public String login()
    {
        return "index";
    }
}
