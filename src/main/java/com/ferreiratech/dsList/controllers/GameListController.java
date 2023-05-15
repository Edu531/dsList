package com.ferreiratech.dsList.controllers;

import com.ferreiratech.dsList.dto.GameListDTO;
import com.ferreiratech.dsList.dto.GameMinDTO;
import com.ferreiratech.dsList.dto.ReplacementDTO;
import com.ferreiratech.dsList.services.GameListService;
import com.ferreiratech.dsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    private GameListService service;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void findByList(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        service.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
