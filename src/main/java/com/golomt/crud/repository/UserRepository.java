package com.golomt.crud.repository;

import com.golomt.crud.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findById(int id);
    User deleteById(int id);
    List<User> findUsersByLastName(String lastname);
    List<User> findUsersById(int id);
    List<User> readAllById(int id);
}
