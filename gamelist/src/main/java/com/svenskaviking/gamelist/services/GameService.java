package com.svenskaviking.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svenskaviking.gamelist.dto.GameDTO;
import com.svenskaviking.gamelist.dto.GameMinDTO;
import com.svenskaviking.gamelist.entities.Game;
import com.svenskaviking.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result =  gameRepository.findById(id).get();
	    return new GameDTO(result);
		
	}
	
	public List<GameMinDTO> findAll(){		
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();			
	}

}
