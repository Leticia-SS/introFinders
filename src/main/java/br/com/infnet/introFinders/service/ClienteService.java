package br.com.infnet.introFinders.service;

import br.com.infnet.introFinders.enums.StatusCliente;
import br.com.infnet.introFinders.model.Cliente;
import br.com.infnet.introFinders.repository.ClienteRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public List<Cliente> buscarClienteAtivos(){
        buscarPorStatus(StatusCliente.ATIVO);
    }

    private void buscarPorStatus(StatusCliente status) {

    }
}
