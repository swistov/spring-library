package ru.greencall.library.spring.dao;

import java.util.List;

public interface GeneralDao<T> {

    List<T> getAll();
    List<T> search(String... searchString);

    T get(long id);
    T save(T obj);
    void delete(T object);
}
