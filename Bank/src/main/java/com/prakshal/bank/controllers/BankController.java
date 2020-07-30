package com.prakshal.bank.controllers;

import com.prakshal.bank.model.Bank;
import com.prakshal.bank.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BankController {

    private final BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/name")
    List<String> name(){

       Set<Bank>bankSet = bankService.findAll();
       ArrayList<String> name = new ArrayList<>();
       bankSet.forEach(bank -> name.add(bank.getName()));

        return name;
    }

    @GetMapping("/address")
    List<String> address(){

        Set<Bank>bankSet = bankService.findAll();
        ArrayList<String> address = new ArrayList<>();
        bankSet.forEach(bank -> address.add(bank.getAddress()));

        return address;
    }


}
