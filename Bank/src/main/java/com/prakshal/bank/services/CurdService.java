package com.prakshal.bank.services;

import java.util.Set;

public interface CurdService<T,ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void deleteById(ID id);
    void delete(T object);

}
