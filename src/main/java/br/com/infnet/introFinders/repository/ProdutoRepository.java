package br.com.infnet.introFinders.repository;

import br.com.infnet.introFinders.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByPrecoLessThan(BigDecimal preco);
    List<Produto> findByAtivo(boolean ativo);
    List<Produto> findByAtivoTrue();
    List<Produto> findByNomeContainingIgnoreCaseAndAtivoTrue(String nome);
}
