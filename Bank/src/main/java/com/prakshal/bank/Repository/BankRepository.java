package com.prakshal.bank.Repository;
import com.prakshal.bank.model.Bank;
import org.springframework.data.repository.CrudRepository;


public interface BankRepository extends CrudRepository<Bank,Long> {
}
