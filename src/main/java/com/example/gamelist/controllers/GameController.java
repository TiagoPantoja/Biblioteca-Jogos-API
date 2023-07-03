package com.example.gamelist.controllers;

import com.example.gamelist.dto.GamesMinDTO;
import com.example.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GamesMinDTO> findAll() {
        List<GamesMinDTO> result = gameService.findAll();
        return result;
    }
}
