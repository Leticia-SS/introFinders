package br.com.infnet.introFinders.repository;

import br.com.infnet.introFinders.enums.StatusCliente;
import br.com.infnet.introFinders.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);
    List<Cliente> findByStatus(StatusCliente statusCliente);
    List<Cliente> findByNomeAndStatus(String nome, StatusCliente statusCliente);
    List<Cliente> findByNomeContaining(String nome);
    List<Cliente> findByNomeStartsWith(String nome);
    // Cliente findByNome(String nome);  se tiverem 2 nomes registrados ele da erro
    Optional<Cliente> findFirst5ByNome(String nome);
    Optional<Cliente> findTop5ByNome(String nome);
    Cliente findByEmail(String email);




    // Conectores: And, Or
    // Comparação: GreaterThan, LessThan, Between
    // Coleções: In, NotIn
    // Texto: Containing. StartsWith, EndingWith, Like
    // Boolean: True, False
    // Ordenação: OrderBy...Asc/Desc
    // Limite: Top, First (findTop3By
    // Distinct (cuidado com performance/join)
}
