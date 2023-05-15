package com.ferreiratech.dsList.services;

import com.ferreiratech.dsList.dto.GameDTO;
import com.ferreiratech.dsList.dto.GameMinDTO;
import com.ferreiratech.dsList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return repository.findAll().stream().map(GameMinDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return repository.findById(id).map(GameDTO::new).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long id) {
        return repository.searchByList(id).stream().map(GameMinDTO::new).collect(Collectors.toList());
    }
}
