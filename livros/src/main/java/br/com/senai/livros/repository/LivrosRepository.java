package br.com.senai.livros.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.senai.livros.model.Livros;


public interface LivrosRepository 
    extends JpaRepository<Livros, Integer>{
    

}
