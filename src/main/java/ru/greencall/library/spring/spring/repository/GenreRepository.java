package ru.greencall.library.spring.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.greencall.library.spring.domain.Genre;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

     List<Genre> findByNameContainingIgnoreCaseOrderByName(String name);
}
