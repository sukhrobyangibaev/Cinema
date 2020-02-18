package com.cinema.Controller;

import com.cinema.Entity.Film;
import com.cinema.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/cinema")
public class CinemaController {

  @Autowired
  private FilmService filmService;

  @GetMapping
  public Collection<Film> getFilms(){
    return filmService.getFilms();
  }

  @PostMapping
  public Film postFilm(@RequestBody Film film){
    return filmService.addFilm(film);
  }

  @GetMapping(value = "/{id}")
  public Optional<Film> getFilmById(@PathVariable("id") int id){
    return filmService.getFilmById(id);
  }

  @GetMapping(value = "/title/{title}")
  public Optional<Film> getFilmByTitle(@PathVariable("title") String title){
    return  filmService.getFilmByTitle(title);
  }

  @GetMapping(value = "/year/{year}")
  public Collection<Film> getFilmByYear(@PathVariable("year") int year){
    return filmService.getFilmByYear(year);
  }

  @GetMapping(value = "/director/{director}")
  public Collection<Film> getFilmByDirector(@PathVariable("director") String director){
    return filmService.getFilmByDirector(director);
  }
}
