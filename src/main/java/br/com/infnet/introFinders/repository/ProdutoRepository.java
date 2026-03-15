package br.com.infnet.introFinders.repository;

import br.com.infnet.introFinders.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
