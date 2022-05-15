package io.github.edu2805.service;

import io.github.edu2805.model.Cliente;
import io.github.edu2805.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    public ClientesRepository clientesRepository;

    //porque autowired + construtor? -> caso houver testes, facilita a criação dos mocks
    @Autowired
    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.clientesRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){

    }
}
