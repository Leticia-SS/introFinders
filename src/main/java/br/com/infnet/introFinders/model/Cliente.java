package br.com.infnet.introFinders.model;

import br.com.infnet.introFinders.enums.StatusCliente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter@Setter
@Table
public class Cliente {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusCliente status = StatusCliente.ATIVO;
    @Column(nullable = false, unique = true)
    private String email;

    protected Cliente() {}

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
