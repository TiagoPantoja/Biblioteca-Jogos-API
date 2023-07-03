package com.example.gamelist.services;

import com.example.gamelist.dto.GamesMinDTO;
import com.example.gamelist.entities.Games;
import com.example.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GamesMinDTO> findAll() {
        List<Games> result = gameRepository.findAll();
        return result.stream().map(GamesMinDTO::new).toList();
    }
}
