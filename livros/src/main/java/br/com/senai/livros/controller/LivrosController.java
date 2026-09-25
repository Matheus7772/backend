package br.com.senai.livros.controller;




import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.livros.model.Livros;
import br.com.senai.livros.service.LivrosService;

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
