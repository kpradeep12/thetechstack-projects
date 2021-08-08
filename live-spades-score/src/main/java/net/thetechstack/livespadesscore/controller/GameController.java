package net.thetechstack.livespadesscore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.thetechstack.livespadesscore.models.Game;
import net.thetechstack.livespadesscore.repositories.GameRepository;


@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired GameRepository gameRepository;

    @GetMapping("{gameId}")
    public Game getMethodName(@PathVariable("gameId") Integer gameId) {
        return gameRepository.getById(gameId);
    }

    @PostMapping
    public void create(Game game) {
        gameRepository.save(game);
    }
    
}
