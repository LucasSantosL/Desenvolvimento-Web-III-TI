package repository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import model.Cliente;

public class ClienteRepository implements IRepository<Cliente>{

    private Set<Cliente> banco = new HashSet<>();

    @Override
    public boolean cadastrar(Cliente entidade) {
        return banco.add(entidade);
    }

    @Override
    public Set<Cliente> listar() {
        return banco;
    }

    @Override
    public Cliente buscar(int id) {
        return banco.stream().filter(obj -> obj.getId() == id).collect(Collectors.toList()).get(0);
    }

    @Override
    public boolean editar(Cliente entidade) {
        for (Cliente cliente : banco) {
            if(cliente.getId() == entidade.getId()){
                cliente = entidade;
                return true;
            }  
        }
        return false;
    }

    @Override
    public boolean remover(int id) {
        return banco.removeIf(obj -> obj.getId() == id);
    }    
}
