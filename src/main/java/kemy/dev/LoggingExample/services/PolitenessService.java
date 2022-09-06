package kemy.dev.LoggingExample.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class PolitenessService {
    private String welcomeMessage="Welcome to my New Java Project";

    Logger logger= LoggerFactory.getLogger(PolitenessService.class);
    public String welcome() throws IOException {
        logger.info("load Welcome from Politeness SERVICE");

        String projectDetails=readFile();
        return welcomeMessage +"\n"+ projectDetails;
    }

    // da sistemare
    private static String readFile() throws IOException {
        Path path = Paths.get("ReadMe.txt");
        String content = null;
        try {
            content = Files.readString(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

}
