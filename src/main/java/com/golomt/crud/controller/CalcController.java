package com.golomt.crud.controller;

import com.golomt.crud.entity.Calc;
import com.golomt.crud.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("")
public class CalcController {

    /**
     * Autowire
     **/

    @Autowired
    CalcService service;

    /*@GetMapping(value = "/calculator/{id}")
    public ResponseEntity<Calc> getCalcById(@PathVariable("id") int id) {
        Optional<Calc> calcData = Optional.ofNullable(repository.findById(id));

        if (calcData.isPresent()){
            return new ResponseEntity<>(calcData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/
    @PostMapping(value = "calculator")
    public Calc postCalc(@RequestBody Calc calc) {
        return service.doSaveUser(calc);
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
