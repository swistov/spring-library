package ru.greencall.library.spring.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.greencall.library.spring.domain.Author;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findByFioContainingIgnoreCaseOrderByFio(String fio);
}
