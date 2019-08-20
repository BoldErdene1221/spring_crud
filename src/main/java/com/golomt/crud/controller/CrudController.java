package com.golomt.crud.controller;

import com.golomt.crud.entity.User;
import com.golomt.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class CrudController {

    /**
     * Autowire
     **/

    @Autowired
    CrudService service;

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public User doSaveUser(@RequestBody User user){
        return service.doSaveUser(user);
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public User doUpdateUser(@PathVariable("id") int id, @RequestBody User user)
    {
        return service.doUpdateUser(id, user);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public User doDeleteUser(@PathVariable("id") int id)
    {
        return service.doDeleteUser(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public List<User> doListIdUser(@PathVariable("id") int id)
    {
        return service.doListIdUser(id);
    }

    @RequestMapping(value = "lastname/{LAST_NAME}", method = RequestMethod.GET)
    public List<User> doListNameUser(@PathVariable("LAST_NAME") String lanae)
    {
        return service.doListNameUser(lanae);
    }

   /* @RequestMapping(value = "alluser", method = RequestMethod.GET)
    public List<User> doListAllUser(@PathVariable("id") int id)
    {
        return service.doListAllUser(id);
    }

    /*@RequestMapping(value = "", method = RequestMethod.POST)
    public HashMap helloWorld(@RequestBody HashMap<String, String> map) {
        int first = Integer.parseInt(map.get("first"));
        int second = Integer.parseInt(map.get("second"));
        double result = 0;
        String operation = String.valueOf(map.get("operation"));
        HashMap mapret = new HashMap<String, String>();
        switch (operation) {
            case "minus":
                result = first - second;
                break;
            case "sum":
                result = first + second;
                break;
            case "multi":
                result = first * second;
                break;
            case "div":
                result = first / second;
                break;
        }
        mapret.put("value", "" + result);
        return mapret;
    }*/
}
