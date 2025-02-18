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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LivreController {
    @Autowired
    private LivreService bookService;

    @GetMapping("/books")
    public List<Livre> getAllLivres() {
        return bookService.getAllLivres();
    }

    @GetMapping("/book")
    public Optional<Livre> getBookbyId(@RequestParam Long id) {
        return bookService.getBookbyId(id);
    }

    @PostMapping("/addbook")
    public void addLivre(@RequestBody Livre livre) {
        bookService.addLivre(livre);
    }

    @DeleteMapping("/bookdel")
    public void removeLivre(@RequestParam Long id) {
        bookService.removeLivre(id);
    }

    @PatchMapping("/bookupdate")
    public Livre patchLivre(@RequestParam Long id, @RequestBody Livre livre) {
        return bookService.patchLivreById(id, livre);

    }

}
