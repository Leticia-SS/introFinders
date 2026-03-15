package br.com.infnet.introFinders.repository;

import br.com.infnet.introFinders.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
