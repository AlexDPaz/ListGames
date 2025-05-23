package com.alex.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alex.DSList.dto.GameDTO;
import com.alex.DSList.dto.GameMinDTO;
import com.alex.DSList.entities.Game;
import com.alex.DSList.projection.GameMinProjection;
import com.alex.DSList.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRopository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRopository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRopository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRopository.searchByList(listId);
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}


}
