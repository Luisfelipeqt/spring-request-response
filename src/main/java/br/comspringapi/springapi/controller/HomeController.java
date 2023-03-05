package br.comspringapi.springapi.controller;

import br.comspringapi.springapi.dto.ClienteDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {


    @GetMapping(value = "/")
    public String home() {

        return "home";
    }

    @PostMapping(value = "/")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public ClienteDTO homer(@RequestBody ClienteDTO clienteDTO){
        System.out.println(clienteDTO.getNome());
        System.out.println(clienteDTO.getIdade());
        System.out.println(clienteDTO);
        return clienteDTO;
    }
}
