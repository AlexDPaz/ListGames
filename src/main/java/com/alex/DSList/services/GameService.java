package com.alex.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.DSList.entities.Game;
import com.alex.DSList.entities.GameMinDTO;
import com.alex.DSList.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRopository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRopository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	 

}
