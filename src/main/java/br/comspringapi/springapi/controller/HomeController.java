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
    public String home() {

        return "home";
    }

    @PostMapping(value = "/")
    @ResponseBody
    public ClienteDTO homer(@RequestBody ClienteDTO clienteDTO){

        return clienteDTO;
    }
}
