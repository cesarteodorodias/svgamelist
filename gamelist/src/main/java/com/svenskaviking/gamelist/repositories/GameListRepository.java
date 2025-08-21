package com.svenskaviking.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.svenskaviking.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
