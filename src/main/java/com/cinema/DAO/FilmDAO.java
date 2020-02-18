package com.cinema.DAO;

import com.cinema.Entity.Film;
import com.cinema.Entity.FilmUpdatePayload;
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

  public Collection<Film> getFilmByDirector(String director) {
    return filmRepository.getFilmByDirector(director);
  }

  public Optional<Film> deleteById(int id) {
    Optional<Film> film = filmRepository.findById(id);
    film.ifPresent(f->filmRepository.delete(f));
    return film;
  }

  public Optional<Film> updateById(int id, FilmUpdatePayload filmUpdatePayload) {
    Optional<Film> film = filmRepository.findById(id);
    film.ifPresent(f->f.setTitle(filmUpdatePayload.getTitle()));
    film.ifPresent(f->f.setDirector(filmUpdatePayload.getDirector()));
    film.ifPresent(f->f.setYear(filmUpdatePayload.getYear()));
    film.ifPresent(f->filmRepository.save(f));
    return film;
  }
}
