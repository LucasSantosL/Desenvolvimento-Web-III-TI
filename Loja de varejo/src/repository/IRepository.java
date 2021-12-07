package repository;

import java.util.Set;

public interface IRepository<E> {
    public boolean cadastrar(E entidade);
    
    public Set<E> listar();

    public E buscar(int id);

    public boolean editar(E entidade);

    public boolean remover(int id);
}
