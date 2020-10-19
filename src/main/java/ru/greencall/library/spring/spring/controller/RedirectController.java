package ru.greencall.library.spring.spring.controller;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.greencall.library.spring.domain.Book;
import ru.greencall.library.spring.spring.repository.AuthorRepository;
import ru.greencall.library.spring.spring.repository.BookRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Log
public class RedirectController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse httpServletResponse) {

//        Page<Author> pageList = authorRepository.findByFioContainingIgnoreCaseOrderByFio("д", PageRequest.of(0, 10, Sort.by(Sort.Direction.ASC, "fio")));
        Page<Book> bookList = bookRepository.findByGenre(1, PageRequest.of(0, 10, Sort.by(Sort.Direction.ASC, "name")));
//        Page<Book> bookList = bookRepository.findAllWithoutContent(PageRequest.of(0, 10, Sort.by(Sort.Direction.ASC, "name")));
//        bookRepository.findByNameContainingIgnoreCaseOrAuthorFioContainingIgnoreCaseOrderByName("г", "наб");
        return "ok";
    }
}
