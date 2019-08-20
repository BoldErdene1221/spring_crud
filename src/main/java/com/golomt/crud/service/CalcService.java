package com.golomt.crud.service;

import com.golomt.crud.entity.Calc;
import com.golomt.crud.repository.CalcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    /**
     * Repository
     **/

    @Autowired
    CalcRepository repository;

    /**
     * do.Save.User
     **/

    public Calc doSaveUser(Calc calc){
        return repository.save(calc);
    }

//    public Calc doUpdateUser(int id, Calc calc){
//        Calc calc1 = repository.findById(id);
//        calc1.setFirstNum(calc.getFirstNum());
//        calc1.setLastNum(calc.getLastNum());
//        calc1.setOperator(calc.getOperator());
//        calc1.setResult(calc.getResult());
//        return repository.save(calc1);
//    }
//
//    public Calc doDeleteUser(int id)
//    {
//        return repository.deleteById(id);
//    }
//
//    public List<Calc> doListNameUser(String lactate)
//    {
//        return repository.findUsersByLastNum(lactate);
//    }
//
//    public List<Calc> doListIdUser(int id)
//    {
//        return repository.findUsersById(id);
//    }
//
//    public List<Calc> doListAllUser(int id)
//    {
//        return repository.readAllById(id);
//    }
}