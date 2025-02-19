package com.tyrfing.bookapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tyrfing.bookapi.model.Livre;
import com.tyrfing.bookapi.repository.LivreRepository;
import java.util.List;
import java.util.Optional;

import lombok.Data;

@Data
@Service

public class LivreService {
    @Autowired
    private LivreRepository repo;

    public List<Livre> getAllLivres() {
        return (List<Livre>) repo.findAll();
    }

    public Optional<Livre> getBookbyId(Long id) {
        return repo.findById(id);
    }

    public void addLivre(Livre livre) {
        repo.save(livre);
    }

    public void removeLivre(Long id) {
        repo.deleteById(id);
    }

    public Optional<Livre> patchLivreById(Long id, Livre livre) {
        Optional<Livre> bookToPatch = repo.findById(id);

        if (bookToPatch.isPresent()) {
            bookToPatch.get().setTitle(livre.getTitle());
            bookToPatch.get().setDesc(livre.getDesc());
            bookToPatch.get().setPublicationDate(livre.getPublicationDate());
            return Optional.of(repo.save(bookToPatch.get()));
        } else {
            throw new RuntimeException("Livre non trouvé pour l'ID : " + id);

        }
    }

}
