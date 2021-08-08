package net.thetechstack.livespadesscore;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import net.thetechstack.livespadesscore.models.Game;
import net.thetechstack.livespadesscore.models.Player;
import net.thetechstack.livespadesscore.models.Team;
import net.thetechstack.livespadesscore.repositories.GameRepository;
import net.thetechstack.livespadesscore.repositories.PlayerRepository;
import net.thetechstack.livespadesscore.repositories.TeamRepository;

@SpringBootApplication
public class LiveSpadesScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveSpadesScoreApplication.class, args);
	}

}

@Component
class GameRepoInitializer implements CommandLineRunner {
	@Autowired PlayerRepository playerRepository;
	@Autowired TeamRepository teamRepository;
	@Autowired GameRepository gameRepository;
	@Override
	public void run(String... args) throws Exception {
		Game game = Game.builder().gameId(1).build();
		
		Team team1 = Team.builder().teamId(UUID.randomUUID().toString()).sequenceOrder(1).teamName("Top").build();
		Team team2 = Team.builder().teamId(UUID.randomUUID().toString()).sequenceOrder(1).teamName("Bottom").build();
		
		Player player1 = Player.builder().playerId(UUID.randomUUID().toString()).playerName("Pradeep").build();
		Player player2 = Player.builder().playerId(UUID.randomUUID().toString()).playerName("Shalini").build();
		Player player3 = Player.builder().playerId(UUID.randomUUID().toString()).playerName("Anvi").build();
		
		team1.setPlayers(Stream.of(player1, player2).collect(Collectors.toSet()));
		team2.setPlayers(Stream.of(player3).collect(Collectors.toSet()));

		Stream.of(player1, player2).forEach(playerRepository::save);

		Stream.of(team1, team2).forEach(teamRepository::save);
		game.setTeams(Stream.of(team1, team2).collect(Collectors.toSet()));

		gameRepository.save(game);

		

	}
}