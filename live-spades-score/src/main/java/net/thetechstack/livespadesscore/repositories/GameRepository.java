package net.thetechstack.livespadesscore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.thetechstack.livespadesscore.models.Game;

public interface GameRepository extends JpaRepository<Game, Integer>{
    
}
