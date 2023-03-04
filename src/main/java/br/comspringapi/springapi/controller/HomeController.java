package br.comspringapi.springapi.controller;

import br.comspringapi.springapi.dto.ClienteDTO;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HomeController {

    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

    @PostMapping(value = "/")
    public String home(ClienteDTO clienteDTO){
        System.out.println(clienteDTO.getNome());
        System.out.println(clienteDTO.getIdade());

        return "redirect:/";
    }


}
