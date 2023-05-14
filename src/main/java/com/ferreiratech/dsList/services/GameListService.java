package com.ferreiratech.dsList.services;

import com.ferreiratech.dsList.dto.GameListDTO;
import com.ferreiratech.dsList.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return repository.findAll().stream().map(GameListDTO::new).toList();
    }
}
