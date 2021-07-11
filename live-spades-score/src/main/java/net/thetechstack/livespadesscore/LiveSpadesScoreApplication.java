package net.thetechstack.livespadesscore;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import net.thetechstack.livespadesscore.models.Player;
import net.thetechstack.livespadesscore.repositories.PlayerRepository;
import java.util.UUID;

@SpringBootApplication
public class LiveSpadesScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveSpadesScoreApplication.class, args);
	}

}

@Component
class GameRepoInitializer implements CommandLineRunner {
	@Autowired PlayerRepository playerRepository;
	@Override
	public void run(String... args) throws Exception {
		Stream.of(new Player(UUID.randomUUID().toString(), "pradeep"),
		new Player(UUID.randomUUID().toString(), "shalini"))
		.forEach(playerRepository::save);
	}
}