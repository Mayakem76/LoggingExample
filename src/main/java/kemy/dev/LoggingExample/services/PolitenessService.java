package kemy.dev.LoggingExample.services;

import kemy.dev.LoggingExample.controllers.LogController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PolitenessService {
    Logger logger= LoggerFactory.getLogger(PolitenessService.class);
    public String welcome(){
        logger.info("load Welcome from Politeness SERVICE");
        return "Welcome to my New Java Project";
    }
}
