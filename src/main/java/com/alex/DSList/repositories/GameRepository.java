package com.alex.DSList.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.DSList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
