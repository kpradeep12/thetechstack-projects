package net.thetechstack.livespadesscore.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Team {
    @Id
    private String teamId;
    private String teamName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name ="player_team",
        joinColumns = {@JoinColumn(name="teamId")},
        inverseJoinColumns = {@JoinColumn(name="playerId")}
    )
    private Set<Player> players;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="team_game", 
        joinColumns = {@JoinColumn(name="teamId")},
        inverseJoinColumns = {@JoinColumn(name="gameId")}
    )
    private Game game;
    

    /**
     * @return String return the teamId
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * @param teamId the teamId to set
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * @return String return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return Set<Player> return the players
     */
    public Set<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    /**
     * @return Game return the game
     */
    public Game getGame() {
        return game;
    }

    /**
     * @param game the game to set
     */
    public void setGame(Game game) {
        this.game = game;
    }

}
