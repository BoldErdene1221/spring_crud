package com.golomt.crud.service;

import com.golomt.crud.entity.User;
import com.golomt.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {

    /**
     * Repository
     **/

    @Autowired
    UserRepository repository;

    /**
     * do.Save.User
     **/

    public User doSaveUser(User user){
        return repository.save(user);
    }

    public User doUpdateUser(int id, User user){
        User user1 = repository.findById(id);
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setEmail(user.getEmail());
        return repository.save(user1);
    }

    public User doDeleteUser(int id)
    {
        return repository.deleteById(id);
    }

    public List<User> doListNameUser(String lactate)
    {
         return repository.findUsersByLastName(lactate);
    }

    public List<User> doListIdUser(int id)
    {
        return repository.findUsersById(id);
    }

    public List<User> doListAllUser(int id)
    {
        return repository.readAllById(id);
    }
}