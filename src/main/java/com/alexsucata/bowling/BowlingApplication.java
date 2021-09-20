package com.alexsucata.bowling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@SpringBootApplication
@Profile("bowling")
public class BowlingApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(BowlingApplication.class);

    public static void main(String[] args) {
        logger.info("Starting the Bowling application");
        SpringApplication.run(BowlingApplication.class, args);
        logger.info("Ending the Bowling application");
        System.out.println("Starting game between 2 computer players\n");
        ComputerPlayer player1 = new ComputerPlayer(1, "Player 1", ComputerPlayer.LEVELS.BEGINNER);
        ComputerPlayer player2 = new ComputerPlayer(2, "Player 2", ComputerPlayer.LEVELS.PRO);

        for (int i = 0; i < 10; i++) {
            player1.addRandomFrame();
            player2.addRandomFrame();
        }

        System.out.format("Player 1 score: %d\n", player1.getGameScore());
        System.out.format("Player 2 score: %d\n", player2.getGameScore());
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Starting collecting data{}", Arrays.toString(args));
    }
}
