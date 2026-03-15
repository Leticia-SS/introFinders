package br.com.infnet.introFinders.repository;

import br.com.infnet.introFinders.enums.StatusPedido;
import br.com.infnet.introFinders.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatus(StatusPedido statusPedido);
    List<Pedido> findByStatusAndCriadoEmBetween(StatusPedido statusPedido, LocalDateTime inicio, LocalDateTime fim);
}
