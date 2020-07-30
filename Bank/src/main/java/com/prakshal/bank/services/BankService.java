package com.prakshal.bank.services;


import com.prakshal.bank.model.Bank;

import java.util.Set;

public interface BankService extends CurdService<Bank,Long> {

    @Override
    Set<Bank> findAll();

    @Override
    Bank findById(Long aLong);

    @Override
    Bank save(Bank object);

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Bank object);
}
