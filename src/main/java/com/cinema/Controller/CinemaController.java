package com.cinema.Controller;

import com.cinema.Entity.Film;
import com.cinema.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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
}
