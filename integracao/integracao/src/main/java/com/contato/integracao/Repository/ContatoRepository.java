package com.contato.integracao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contato.integracao.Model.ContatoModel; 


public interface ContatoRepository extends JpaRepository<ContatoModel, Long> { }

