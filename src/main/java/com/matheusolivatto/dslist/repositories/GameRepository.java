package com.matheusolivatto.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusolivatto.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
