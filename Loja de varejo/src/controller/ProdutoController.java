package controller;

import java.util.Set;

import model.Produto;
import repository.ProdutoRepository;


public class ProdutoController implements IController<Produto>{
    private ProdutoRepository produtoRepository = new ProdutoRepository();

    @Override
    public boolean cadastrar(Produto entidade) {
        if(entidade != null)
        return produtoRepository.cadastrar(entidade);
        return false;
    }

    @Override
    public Set<Produto> listar() {
        return produtoRepository.listar();
    }

    @Override
    public Produto buscar(int id) {
        if(id<0)
        return null;
        return produtoRepository.buscar(id);
    }

    @Override
    public boolean editar(Produto entidade) {
        if(entidade != null)
        return produtoRepository.editar(entidade);
        return false;
    }

    @Override
    public boolean remover(int id) {
        if(id <0)
        return false;
        return produtoRepository.remover(id);
    }
}
