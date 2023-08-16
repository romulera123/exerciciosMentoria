package br.gama.farmacia.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaListeners {

    String lastmessage;

    @KafkaListener(id="Farmacia", topics = "hospital-farmacia")
    public void listenString(String msg) {
        
        lastmessage =  msg;
        
    }

    public String getMessage(){
        this.listenString(lastmessage);
        return lastmessage;
    }

}
