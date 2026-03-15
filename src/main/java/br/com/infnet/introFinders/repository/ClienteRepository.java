package br.com.infnet.introFinders.repository;

import br.com.infnet.introFinders.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
