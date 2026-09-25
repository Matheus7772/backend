package br.com.senai.livros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/livros")
    public String livros() {
        return "Backend rodando na porta 9991";
    }
}