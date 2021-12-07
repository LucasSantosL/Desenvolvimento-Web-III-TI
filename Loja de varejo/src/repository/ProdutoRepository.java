package repository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import model.Produto;

public class ProdutoRepository implements IRepository<Produto>{

    private Set<Produto> banco = new HashSet<>();

    @Override
    public boolean cadastrar(Produto entidade) {
        return banco.add(entidade);
    }

    @Override
    public Set<Produto> listar() {
        return banco;
    }

    @Override
    public Produto buscar(int id) {
        return banco.stream().filter(obj -> obj.getId() == id).collect(Collectors.toList()).get(0);
    }

    @Override
    public boolean editar(Produto entidade) {
        for (Produto produto : banco) {
            if(produto.getId() == entidade.getId()){
                produto = entidade;
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

