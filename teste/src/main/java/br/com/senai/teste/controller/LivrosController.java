package br.com.senai.teste.controller;




import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.teste.model.Livros;
import br.com.senai.teste.service.LivrosService;

@RestController 
@RequestMapping ("/livros")
public class LivrosController {

    private final LivrosService livrosService;

    public LivrosController(LivrosService livrosService){
        this.livrosService = livrosService;
    }

@PostMapping 
public ResponseEntity<Livros> cadastrar(
    @RequestBody Livros livro){

        Livros livroCadastrado = livrosService.cadastrar(livro);

                return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(livroCadastrado);
    }

    
}
