package com.matheusolivatto.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matheusolivatto.dslist.dto.GameListDTO;
import com.matheusolivatto.dslist.entities.GameList;
import com.matheusolivatto.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	public GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
