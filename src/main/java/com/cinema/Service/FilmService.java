package com.cinema.Service;

import com.cinema.DAO.FilmDAO;
import com.cinema.Entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class FilmService {

  @Autowired
  private FilmDAO filmDAO;

  public Collection<Film> getFilms(){
    return filmDAO.getFilms();
  }

  public Film addFilm(Film film) {
    return filmDAO.addFilm(film);
  }

  public Optional<Film> getFilmById(int id) {
    return filmDAO.getFilmById(id);
  }

  public Collection<Film> getFilmByYear(int year) {
    return filmDAO.getFilmByYear(year);
  }

  public Optional<Film> getFilmByTitle(String title) {
    return filmDAO.getFilmByTitle(title);
  }
}
