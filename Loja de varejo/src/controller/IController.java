package controller;

import java.util.Set;

public interface IController<E>{
    public boolean cadastrar(E entidade);
    
    public Set<E> listar();

    public E buscar(int id);

    public boolean editar(E entidade);

    public boolean remover(int id);

}