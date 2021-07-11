package net.thetechstack.livespadesscore.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor
public class Game {
    @Id
    private String gameId;
    private Integer gameCode;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name ="team_game",
        joinColumns = {@JoinColumn(name="gameId")},
        inverseJoinColumns = {@JoinColumn(name="teamId")}
    )
    private Set<Team> teams;
    

    /**
     * @return String return the gameId
     */
    public String getGameId() {
        return gameId;
    }

    /**
     * @param gameId the gameId to set
     */
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    /**
     * @return Integer return the gameCode
     */
    public Integer getGameCode() {
        return gameCode;
    }

    /**
     * @param gameCode the gameCode to set
     */
    public void setGameCode(Integer gameCode) {
        this.gameCode = gameCode;
    }

    /**
     * @return LocalDateTime return the startTime
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * @return LocalDateTime return the endTime
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * @return Set<Team> return the teams
     */
    public Set<Team> getTeams() {
        return teams;
    }

    /**
     * @param teams the teams to set
     */
    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

}
