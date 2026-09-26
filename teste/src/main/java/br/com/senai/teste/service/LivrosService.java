package br.com.senai.teste.service;


import org.springframework.stereotype.Service;


import br.com.senai.teste.model.Livros;
import br.com.senai.teste.repository.LivrosRepository;

@Service 
public class LivrosService {
    private final LivrosRepository livrosRepository;

    public LivrosService(LivrosRepository livrosRepository){
        this.livrosRepository = livrosRepository;

    }

    public Livros cadastrar(Livros livro){
        return livrosRepository.save(livro);
    }
}
