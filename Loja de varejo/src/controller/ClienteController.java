package controller;

import java.util.Set;

import model.Cliente;
import repository.ClienteRepository;

public class ClienteController implements IController<Cliente>{
    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public boolean cadastrar(Cliente entidade) {
        if(entidade != null)
        return clienteRepository.cadastrar(entidade);
        return false;
    }

    @Override
    public Set<Cliente> listar() {
        return clienteRepository.listar();
    }

    @Override
    public Cliente buscar(int id) {
        if(id<0)
        return null;
        return clienteRepository.buscar(id);
    }

    @Override
    public boolean editar(Cliente entidade) {
        if(entidade != null)
        return clienteRepository.editar(entidade);
        return false;
    }

    @Override
    public boolean remover(int id) {
        if(id <0)
        return false;
        return clienteRepository.remover(id);
    }

}
