package com.prakshal.bank.services;

import com.prakshal.bank.Repository.BankRepository;
import com.prakshal.bank.model.Bank;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

@Service
public class BankServiceImpl implements BankService{

    private final BankRepository bankRepository;

    public BankServiceImpl(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public Set<Bank> findAll() {

        Set<Bank> banks = new HashSet<>();
        bankRepository.findAll().forEach(banks::add);

        return banks;

    }

    @Override
    public Bank findById(Long aLong) {
        return bankRepository.findById(aLong).orElse(null);
    }

    @Override
    public Bank save(Bank object) {
        return bankRepository.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        bankRepository.deleteById(aLong);

    }
    @Override
    public void delete(Bank object) {
        bankRepository.delete(object);
    }
}
