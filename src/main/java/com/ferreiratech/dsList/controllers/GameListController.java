package com.ferreiratech.dsList.controllers;

import com.ferreiratech.dsList.dto.GameListDTO;
import com.ferreiratech.dsList.dto.GameMinDTO;
import com.ferreiratech.dsList.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping
    public List<GameListDTO> findAll() {
        return service.findAll();
    }
}
