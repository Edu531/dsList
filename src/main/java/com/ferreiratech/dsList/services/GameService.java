package com.ferreiratech.dsList.services;

import com.ferreiratech.dsList.dto.GameMinDTO;
import com.ferreiratech.dsList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        return repository.findAll().stream().map(GameMinDTO::new).collect(Collectors.toList());
    }
}
