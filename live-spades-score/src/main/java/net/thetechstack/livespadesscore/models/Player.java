package net.thetechstack.livespadesscore.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Player {
    @Id
    private String playerId;
    private String playerName;
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="player_team", 
        joinColumns = {@JoinColumn(name="playerId")},
        inverseJoinColumns = {@JoinColumn(name="teamId")}
    )
    private Team team;*/

}
