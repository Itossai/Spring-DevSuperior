package com.devsuperior.dslist.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GamesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping(value = "/gamelists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GamesService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> gameListDTO = gameListService.findAll();
        return gameListDTO;
    }
    @GetMapping(value = "/{game_list_id}/games")
    public List<GameMinDTO> findByList(@PathVariable Long game_list_id){
        List<GameMinDTO> listGames = gameService.findByList(game_list_id);
        return listGames;
    }
}
