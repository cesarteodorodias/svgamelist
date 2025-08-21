package com.svenskaviking.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.svenskaviking.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
