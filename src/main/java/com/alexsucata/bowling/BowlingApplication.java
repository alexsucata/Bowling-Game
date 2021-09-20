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
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Starting collecting data{}", Arrays.toString(args));
    }
}
