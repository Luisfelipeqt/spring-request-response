package br.comspringapi.springapi.controller;

import br.comspringapi.springapi.dto.ClienteDTO;
import jakarta.servlet.http.HttpServletRequest;
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
    public ResponseEntity<ClienteDTO> homer(@RequestBody ClienteDTO clienteDTO){
        System.out.println(clienteDTO.getNome());
        System.out.println(clienteDTO.getIdade());
        System.out.println(clienteDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Teste", "Teste")
                .header("Teste2", "Teste2")
                .body(clienteDTO);
    }
}
