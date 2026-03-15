package br.com.infnet.introFinders.model;

import br.com.infnet.introFinders.enums.StatusPedido;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
public class Pedido {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Cliente cliente;
    private StatusPedido status = StatusPedido.CRIADO;

    private LocalDateTime criadoEm = LocalDateTime.now();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemPedido> item = new ArrayList<>();

    protected Pedido() {}

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
}
