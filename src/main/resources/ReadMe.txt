scrivi un'applicazione Spring Boot con le dipendenze necessarie che:
ha due variabili di ambiente int personalizzate con i valori 2e8
inizia da INFOper la registrazione a livello di root
inizia da DEBUGper la registrazione a livello di servizi
possibili valori:
#    DEBUG
#    ERROR
#    FATAL
#    INFO
#    OFF
#    TRACE
#    WARN

le informazioni di registrazione hanno i colori ANSI abilitati
ha un controller di base che ha 3 mappature:
/: restituisce solo un messaggio di benvenuto e lo registra
/exp: restituisce un servizio che:
prende i 2 valori di env numerici, quindi registra e restituisce la potenza (esponente) dei 2 valori
log all'inizio e alla fine del calcolo
/get-errors: genera un nuovo errore personalizzato che verrà registrato
salva tutti i log in una sottocartella chiamatamyCustomLogs

-------------------------------------------------------------------------
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