package com.cinema.DAO;

import com.cinema.Entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FilmDAO {

  @Autowired
  FilmRepository filmRepository;

  public Collection<Film> getFilms(){
    return filmRepository.findAll();
  }
}