package br.comspringapi.springapi.controller;

import br.comspringapi.springapi.dto.ClienteDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class HomeController {

    @Autowired
    private ClienteDTO clienteDTO;

    @GetMapping(value = "/")
    public String home(@RequestParam(name = "nome", defaultValue = "Felipe", required = false) String nome, @RequestParam(name = "idade", defaultValue = "28", required = false) Integer idade, @RequestParam("nomes") List<String> nomes) {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(nomes);
        return "home";
    }

    @PostMapping(value = "/")
    public String home(@PathParam("/") ClienteDTO clienteDTO){
        System.out.println(clienteDTO.getNome());
        System.out.println(clienteDTO.getIdade());

        return "redirect:/";
    }
}
