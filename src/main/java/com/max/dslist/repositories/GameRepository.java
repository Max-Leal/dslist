package com.max.dslist.repositories;

import com.max.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository  extends JpaRepository<Game, Long> {

}
