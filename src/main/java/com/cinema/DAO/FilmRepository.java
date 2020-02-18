package com.cinema.DAO;

import com.cinema.Entity.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;
import java.util.Optional;

public interface FilmRepository extends MongoRepository<Film, Integer> {

  Collection<Film> getFilmByYear(int year);

  Optional<Film> getFilmByTitle(String title);

  Collection<Film> getFilmByDirector(String director);
}
