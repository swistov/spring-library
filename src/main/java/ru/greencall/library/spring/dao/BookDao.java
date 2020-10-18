package ru.greencall.library.spring.dao;

import ru.greencall.library.spring.domain.Book;

import java.util.List;

public interface BookDao extends GeneralDao<Book>{

    List<Book> findTopBooks(int limit);
}
