package ru.greencall.library.spring.spring.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.greencall.library.spring.domain.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByNameContainingIgnoreCaseOrAuthorFioContainingIgnoreCaseOrderByName(String name, String fio);

    // TODO: Add Query findAllWithoutContent

    @Modifying(clearAutomatically = true)
    @Query("update Book b set b.content=:content where b.id =:id")
    void updateContent(@Param("content") byte[] content, @Param("id") long id);

    @Query("select new ru.greencall.library.spring.domain.Book(b.id, b.image) from Book b")
    List<Book> findTopBooks(Pageable pageable);
}
