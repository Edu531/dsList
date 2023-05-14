package com.ferreiratech.dsList.repository;

import com.ferreiratech.dsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
