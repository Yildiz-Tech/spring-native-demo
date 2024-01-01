package com.sacidpak.springnativedemo.controller;

import com.sacidpak.springnativedemo.data.Game;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaygroundController {

  @GetMapping
  @RequestMapping("/games")
  public List<Game> getGames(){
    return List.of(new Game("Chess"),
                   new Game("Puzzles"));
  }
}

