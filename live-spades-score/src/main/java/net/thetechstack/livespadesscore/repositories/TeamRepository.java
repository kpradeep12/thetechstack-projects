package net.thetechstack.livespadesscore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.thetechstack.livespadesscore.models.Team;

public interface TeamRepository extends JpaRepository<Team, String>{
    
}
