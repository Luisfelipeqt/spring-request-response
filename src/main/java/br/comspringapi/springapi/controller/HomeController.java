package br.comspringapi.springapi.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HomeController {


    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(HttpMethod method) {
        if(method.equals(HttpMethod.GET)){
            System.out.println("Recebi uma requisição do tipo GET");
        } else if (method.equals(HttpMethod.POST)) {
            System.out.println("Recebi uma requisição do tipo POST");
        }
        return "home";
    }


}
