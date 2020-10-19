package ru.greencall.library.spring.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface GeneralDao<T> {

    List<T> getAll();
    List<T> search(String... searchString);

    T get(long id);
    T save(T obj);
    void delete(T object);

    // получение всех записей с сортировкой результата
    List<T> getAll(Sort sort);

    // получение всех записей с постраничностью
    Page<T> getAll(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection);

    // поиск записей с постраничностью
    Page<T> search(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, String... searchString);
}
