package com.golomt.crud.repository;

import com.golomt.crud.entity.Calc;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CalcRepository extends CrudRepository<Calc, Integer> {

    Calc findById(int id);
    Calc deleteById(int id);
    List<Calc> findUsersByLastNum(String lastNum);
    List<Calc> findUsersById(int id);
    List<Calc> readAllById(int id);
}
