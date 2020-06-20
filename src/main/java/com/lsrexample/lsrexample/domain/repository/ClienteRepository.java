package com.lsrexample.lsrexample.domain.repository;

import java.util.List;

import com.lsrexample.lsrexample.domain.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Tipo da Classe e qual é o tipo do ID -> por isso Long
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);

    List<Cliente> findByNomeContaining(String nome);

}