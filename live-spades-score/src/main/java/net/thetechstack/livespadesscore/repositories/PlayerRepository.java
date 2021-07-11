package net.thetechstack.livespadesscore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.thetechstack.livespadesscore.models.Player;

public interface PlayerRepository extends JpaRepository<Player, String>{
    
}
