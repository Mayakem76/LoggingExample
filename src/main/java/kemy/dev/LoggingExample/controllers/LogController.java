package kemy.dev.LoggingExample.controllers;

import kemy.dev.LoggingExample.services.MathService;
import kemy.dev.LoggingExample.services.PolitenessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*ha un controller di base che ha 3 mappature:
/: restituisce solo un messaggio di benvenuto e lo registra
/exp: restituisce un servizio che:
prende i 2 valori di env numerici, quindi registra e restituisce la potenza (esponente) dei 2 valori
log all'inizio e alla fine del calcolo
/get-errors: genera un nuovo errore personalizzato che verrà registrato
 */
@RestController
public class LogController {
    @Autowired
    Environment environment;
    @Autowired
    MathService mathService;
    @Autowired
    PolitenessService politenessService;
    Logger logger= LoggerFactory.getLogger(LogController.class);
    @Value("${customEnvs.n1}")
    int envValue1;
    @Value("${customEnvs.n2}")
    int envValue2;

    @GetMapping("/")
    public String welcome(){
        logger.info("CALLING Welcome FROM CONTROLLER");
        return politenessService.welcome();
    }
    @GetMapping("/exp")
    public String exp(){
        logger.info("CALLING exp FROM CONTROLLER");
     return mathService.exp();
    }
    @GetMapping("/pow")
    public String pow(){
        logger.info("CALLING pow FROM CONTROLLER");
        return mathService.pow();
    }
    @GetMapping("/errors")
    public void getError(){
        Error error=new Error("THIS IS THE ERROR");//LOGGA TUTTI GLI ERRORI
        logger.error("this is an ERROR logger:",error);
    }
}
