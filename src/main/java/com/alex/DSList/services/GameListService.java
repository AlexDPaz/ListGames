package com.alex.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alex.DSList.dto.GameListDTO;
import com.alex.DSList.entities.GameList;
import com.alex.DSList.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRopository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRopository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
	 

}
