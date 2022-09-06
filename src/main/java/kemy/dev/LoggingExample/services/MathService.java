package kemy.dev.LoggingExample.services;

import kemy.dev.LoggingExample.controllers.LogController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    @Autowired
    Environment environment;
    Logger logger= LoggerFactory.getLogger(MathService.class);
    @Value("${customEnvs.n1}")
    int envValue1;
    @Value("${customEnvs.n2}")
    int envValue2;

    public String exp(){
        logger.info("LOAD exp from Math SERVICE");
        int result1= (int) Math.exp(envValue1);
        int result2=(int) Math.exp(envValue2);
        return "Math.exp - Un numero che rappresenta e^x , dove e è il numero di Eulero e x è l'argomento." +
                "\nResult: Math.exp(2): "+result1+" - Math.exp(8): "+result2+
                "\nNumero di Eulero: 2,71828 18284 59045 23536 ... ";
    }
    public String pow(){
        logger.info("LOAD pow from  Math SERVICE");
        int result= (int) Math.pow(envValue1,envValue2);
        return "Math.pow - Restituisce un numero che rappresenta la base data portato alla potenza dell'esponente dato." +
                "\nResult: Math.pow(2,8)= "+result;

    }


}
