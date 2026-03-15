package br.com.infnet.introFinders.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter@Setter
@Table(name = "produtos")
public class Produto {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal preco;
    private boolean ativo = true;

    protected Produto() {}

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
