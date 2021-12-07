package br.com.raulgustavo.introspring.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.raulgustavo.introspring.model.User;

@Repository
public class UserRepository {
    private List<User> ListOfUsers = new ArrayList<>();

    public boolean insert(User user){
        return ListOfUsers.add(user);
    }

    public List<User> findAll(){
        return ListOfUsers;
    }

    public User buscar(int id) {
        return ListOfUsers.stream().filter(obj -> obj.getId() == id).collect(Collectors.toList()).get(0);
    }

    public boolean remover(int id) {
        return ListOfUsers.removeIf(obj -> obj.getId() == id);
    }

}
