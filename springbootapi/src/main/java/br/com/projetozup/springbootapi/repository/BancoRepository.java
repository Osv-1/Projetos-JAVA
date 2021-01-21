package br.com.projetozup.springbootapi.repository;

import br.com.projetozup.springbootapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BancoRepository extends JpaRepository<Pessoa, Long> {

}
