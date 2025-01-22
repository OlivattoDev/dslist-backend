package com.matheusolivatto.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusolivatto.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
