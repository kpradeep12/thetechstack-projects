package net.thetechstack.livespadesscore.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor  @Builder
public class Game {
    @Id
    private Integer gameId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name ="team_game",
        joinColumns = {@JoinColumn(name="gameId")},
        inverseJoinColumns = {@JoinColumn(name="teamId")}
    )
    private Set<Team> teams;
    

}
