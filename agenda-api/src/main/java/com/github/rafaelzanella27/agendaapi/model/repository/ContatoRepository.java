package com.github.rafaelzanella27.agendaapi.model.repository;

import com.github.rafaelzanella27.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
