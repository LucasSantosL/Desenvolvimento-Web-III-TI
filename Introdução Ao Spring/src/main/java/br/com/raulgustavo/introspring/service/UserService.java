package br.com.raulgustavo.introspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.raulgustavo.introspring.model.User;
import br.com.raulgustavo.introspring.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public boolean insert(User user){
        return repository.insert(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public User buscar(int id) {
        if(id<0)
        return null;
        return repository.buscar(id);
    }

    public boolean remover(int id) {
        if(id <0)
        return false;
        return repository.remover(id);
    }
}
