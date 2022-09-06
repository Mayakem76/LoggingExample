--DESCRIZIONE PROGETTO: -----------------------------------------------------------------------
Il progetto è stato creato come esempio di utilizzo dell'interfaccia Logger
- file di configurazione: logback-spring.xml - crea una cartella (myCustomLogs) con dentro un file.log in cui vengono
salvati tutti i log generati durante l'esecuzione del programma.

-application.properties: contiene le configurazioni del log per ogni livello su ogni classe.
-BasicController: contiene 3 chiamate:
    -("/") welcome : Messaggio di benvenuto da PolitenessService e la descrizione che stai leggendo in questo momento;
    -("/exp") exp: esegue la funzione Math.exp per ogni numeri intero dato (environment variables);
    -("/pow") pow: esegue la potenza della base envValue1 con esponente envValue2;
    -("/errors)" getError: esegue il log di tutti gli errori (da testare)
-PolitenessService: contiene metodi di messaggi di cortesia (welcome, goodbye etc)
    - welcome: return welcome message and ReadMe file;


--TRACCIA ORIGINALE: ----------------------------------------------------------------------
write a Spring Boot application with the necessary dependencies that:
has two custom int environment variables with the values 2 and 8
starts from INFO for root level logging
starts from DEBUG for services level logging
the logging info has ANSI colours enabled
has a basic controller that has 3 mappings:
/: returns just a welcome message and logs it
/exp: returns a service that:
takes the 2 numeric env values, then logs and returns the power (exponent) of the 2 values
logs when starting and when finishing the calculation
/get-errors: throws a new custom error that will be logged
saves all the logs in a subfolder called myCustomLogs