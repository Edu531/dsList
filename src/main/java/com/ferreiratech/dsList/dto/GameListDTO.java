package com.ferreiratech.dsList.dto;


import com.ferreiratech.dsList.entities.GameList;
import jakarta.persistence.*;

import java.util.Objects;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
