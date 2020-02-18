package com.cinema.DAO;

import com.cinema.Entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class FilmDAO {

  @Autowired
  FilmRepository filmRepository;

  public Collection<Film> getFilms(){
    return filmRepository.findAll();
  }

  public Film addFilm(Film film) {
    return filmRepository.insert(film);
  }

  public Optional<Film> getFilmById(int id) {
    return filmRepository.findById(id);
  }

  public Collection<Film> getFilmByYear(int year) {
    return filmRepository.getFilmByYear(year);
  }

  public Optional<Film> getFilmByTitle(String title) {
    return filmRepository.getFilmByTitle(title);
  }
}
