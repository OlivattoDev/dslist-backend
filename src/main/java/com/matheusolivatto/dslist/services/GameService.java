package com.matheusolivatto.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusolivatto.dslist.dto.GameMinDTO;
import com.matheusolivatto.dslist.entities.Game;
import com.matheusolivatto.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	public GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
