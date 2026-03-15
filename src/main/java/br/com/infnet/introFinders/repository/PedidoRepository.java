package br.com.infnet.introFinders.repository;

import br.com.infnet.introFinders.enums.StatusCliente;
import br.com.infnet.introFinders.enums.StatusPedido;
import br.com.infnet.introFinders.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    @Query("""
            select p
            from Pedido p 
            join p.cliente c 
            where c.status = :status
            order by p.criadoEm desc
            """)
    List<Pedido> buscarPedidoPorStatusDoCliente(@Param("status")StatusCliente status);


    @Query("""
            select count(p.id) form Pedido p where p.status = :status
            """)
    Long contarPorStatus(@Param("status")StatusCliente status);


    List<Pedido> findByStatus(StatusPedido statusPedido);
    List<Pedido> findByStatusAndCriadoEmBetween(StatusPedido statusPedido, LocalDateTime inicio, LocalDateTime fim);


}
