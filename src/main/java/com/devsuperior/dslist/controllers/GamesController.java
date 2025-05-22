package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.GamesDTO;
import com.devsuperior.dslist.services.GamesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/games")
public class GamesController {
    @Autowired
    private GamesService gamesService;

    @GetMapping(value="/{id}")
    public GamesDTO findById(@PathVariable Long id){
        GamesDTO gamesDTO = gamesService.findById(id);
        return gamesDTO;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> listGames = gamesService.findAll();
        return listGames;
    }

}
