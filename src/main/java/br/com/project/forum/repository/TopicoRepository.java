package br.com.project.forum.repository;

import br.com.project.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    //Padrão de nomeclatura do Spring
    List<Topico> findByCursoNome(String nomeCurso);
}
