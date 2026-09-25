package br.com.senai.livros.service;


import org.springframework.stereotype.Service;


import br.com.senai.livros.model.Livros;
import br.com.senai.livros.repository.LivrosRepository;

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
