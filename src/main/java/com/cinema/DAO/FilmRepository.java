package com.cinema.DAO;

import com.cinema.Entity.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

public interface FilmRepository extends MongoRepository<Film, Integer> {

  public Collection<Film> getFilmByYear(int year);
}
