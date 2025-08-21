package com.svenskaviking.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svenskaviking.gamelist.dto.GameListDTO;
import com.svenskaviking.gamelist.entities.GameList;
import com.svenskaviking.gamelist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
		
	public List<GameListDTO> findAll(){		
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();			
	}

}
