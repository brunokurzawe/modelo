package com.senac.senac.repository;

import com.senac.senac.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>, QuerydslPredicateExecutor<Pais> {

    List<Pais> findByNome(String nome);

    List<Pais> findBySigla(String sigla);

}


