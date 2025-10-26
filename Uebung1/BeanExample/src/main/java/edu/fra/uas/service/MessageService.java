package edu.fra.uas.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Component
public class MessageService {
    private static final Logger log = LoggerFactory.getLogger(MessageService.class);
    private String message;
    private Integer counter= 0;
    
    public String getMessage() {
        log.debug("getMessage() erfolgreich aufgerufen. Nachricht lautet: {}", message );
        return message;
    }

    public void setMessage(String message) {
        log.debug("setMessage() wurde aufgerufen mit Parameter: {}", message);
        this.message = message;
    }
   public void increment() {
        counter++;
        log.debug("counter wurde erhöht: {}", counter);
    }

    public Integer getCounter() {
        return counter;
    }
}
