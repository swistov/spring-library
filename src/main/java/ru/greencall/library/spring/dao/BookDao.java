package ru.greencall.library.spring.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import ru.greencall.library.spring.domain.Book;

import java.util.List;

public interface BookDao extends GeneralDao<Book>{

    // поиск топовых книг
    List<Book> findTopBooks(int limit);

    // получение по ID
    byte[] getContent(long id);

    // постраничный вывод книг определённого жанра
    Page<Book> findByGenre(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, long genreId);
}
