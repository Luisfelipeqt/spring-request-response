package br.comspringapi.springapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@RequestHeader(name = "Accept-Language", defaultValue = "Teste") String acceptLanguage) {
        System.out.println(acceptLanguage);
        return "home";
    }


}
