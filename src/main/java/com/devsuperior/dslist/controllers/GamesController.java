package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GamesService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/games")
public class GamesController {
    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> listGames = gamesService.findAll();
        return listGames;
    }
}
