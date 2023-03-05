package br.comspringapi.springapi.controller;

import br.comspringapi.springapi.dto.ClienteDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller // -> Se o projeto tiver Thymeleaf para mapear o Template tem que usar o @Controller em vez do @RestController
public class HomeController {


    @GetMapping(value = "/")
    public String home() {

        return "home";
    }

    @PostMapping(value = "/")
    public void homer(@RequestBody ClienteDTO clienteDTO, HttpServletResponse response) {
        response.setStatus(201);
        response.setHeader("Teste","Teste");
    }
}
