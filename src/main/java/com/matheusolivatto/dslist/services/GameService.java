package com.matheusolivatto.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matheusolivatto.dslist.dto.GameDTO;
import com.matheusolivatto.dslist.dto.GameMinDTO;
import com.matheusolivatto.dslist.entities.Game;
import com.matheusolivatto.dslist.projections.GameMinProjection;
import com.matheusolivatto.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	public GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
