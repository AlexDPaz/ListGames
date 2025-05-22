package com.alex.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.DSList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
