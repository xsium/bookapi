package com.tyrfing.bookapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tyrfing.bookapi.model.Livre;
import com.tyrfing.bookapi.service.LivreService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LivreController {
    @Autowired
    private LivreService bookService;

    @GetMapping("/books")
    public List<Livre> getAllLivres() {
        return bookService.getAllLivres();
    }

    @GetMapping("/book/{id}")
    public Optional<Livre> getBookbyId(@PathVariable Long id) {
        return bookService.getBookbyId(id);
    }

    @PostMapping("/book")
    public void addLivre(@RequestBody Livre livre) {
        bookService.addLivre(livre);
    }

    @DeleteMapping("/book/{id}")
    public void removeLivre(@PathVariable Long id) {
        bookService.removeLivre(id);
    }

    @PatchMapping("/book/{id}")
    public Optional<Livre> patchLivre(@PathVariable Long id, @RequestBody Livre livre) {
        return bookService.patchLivreById(id, livre);

    }

}
