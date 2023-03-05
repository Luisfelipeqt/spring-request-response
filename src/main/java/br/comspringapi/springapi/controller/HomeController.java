package br.comspringapi.springapi.controller;

import br.comspringapi.springapi.dto.ClienteDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class HomeController {

    @Autowired
    private ClienteDTO clienteDTO;

    @GetMapping(value = "/")
    public String home(HttpServletRequest request) {
        System.out.println(request.getHeader("Accept-Language"));
        System.out.println(request.getParameter("nome"));
        System.out.println(request.getUserPrincipal());
        return "home";
    }

    @PostMapping(value = "/")
    public String homer(HttpServletRequest request){
        System.out.println(request.getParameter("nome"));
        System.out.println(request.getParameter("idade"));
        return "redirect:/";
    }
}
