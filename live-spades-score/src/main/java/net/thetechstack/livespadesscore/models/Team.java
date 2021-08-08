package net.thetechstack.livespadesscore.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor  @Builder
public class Team {
    @Id
    private String teamId;
    private Integer sequenceOrder;
    private String teamName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name ="player_team",
        joinColumns = {@JoinColumn(name="teamId")},
        inverseJoinColumns = {@JoinColumn(name="playerId")}
    )
    private Set<Player> players;
    
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="team_game", 
        joinColumns = {@JoinColumn(name="teamId")},
        inverseJoinColumns = {@JoinColumn(name="gameId")}
    )
    private Game game;*/
    

}
