package com.cinema.Service;

import com.cinema.DAO.FilmDAO;
import com.cinema.Entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FilmService {

  @Autowired
  private FilmDAO filmDAO;

  public Collection<Film> getFilms(){
    return filmDAO.getFilms();
  }

}
