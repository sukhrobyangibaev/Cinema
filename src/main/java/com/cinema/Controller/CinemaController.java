package com.cinema.Controller;

import com.cinema.Entity.Film;
import com.cinema.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
