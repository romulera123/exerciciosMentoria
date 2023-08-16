package br.gama.farmacia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gama.farmacia.listeners.KafkaListeners;

@Service
public class FarmaciaService {
    
    @Autowired
    KafkaListeners listener;

    public String getMessage(){
        String msg = listener.getMessage();
        return msg;
    }
}
