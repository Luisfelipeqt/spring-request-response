package br.comspringapi.springapi.controller;

import br.comspringapi.springapi.dto.ClienteDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller

public class HomeController {

    @Autowired
    private ClienteDTO clienteDTO;

    @GetMapping(value = "/")
    public String home(Principal user) {
        System.out.println(user);
        return "home";
    }

    @PostMapping(value = "/")
    public String home(@RequestBody ClienteDTO clienteDTO){
        System.out.println(clienteDTO.getNome());
        System.out.println(clienteDTO.getIdade());

        return "redirect:/";
    }
}
