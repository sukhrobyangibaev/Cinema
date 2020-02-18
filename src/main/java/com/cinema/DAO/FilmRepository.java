package com.cinema.DAO;

import com.cinema.Entity.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmRepository extends MongoRepository<Film, Integer> {
}
