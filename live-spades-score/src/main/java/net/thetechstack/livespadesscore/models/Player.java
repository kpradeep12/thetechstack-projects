package net.thetechstack.livespadesscore.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Player {
    @Id
    private String playerId;
    private String playerName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="player_team", 
        joinColumns = {@JoinColumn(name="playerId")},
        inverseJoinColumns = {@JoinColumn(name="teamId")}
    )
    private Team team;

    public Player() {}
    public Player(String playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
    }
    /**
     * @return String return the playerId
     */
    public String getPlayerId() {
        return playerId;
    }

    /**
     * @param playerId the playerId to set
     */
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * @return String return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return Team return the team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(Team team) {
        this.team = team;
    }

}
