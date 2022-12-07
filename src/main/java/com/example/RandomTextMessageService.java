package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("randomTextMessageService")
public class RandomTextMessageService implements MessageService {

    private String[] myStringArray = {"wiadomosc1", "wiadomosc2", "wiadomosc3",
            "wiadomosc4", "wiadomosc5", "wiadomosc6", "wiadomosc7", "wiadomosc8",
            "wiadomosc9", "wiadomosc10"};
    @Override
    public String getMessage() {
        int rnd = new Random().nextInt(myStringArray.length);
        return myStringArray[rnd];
    }
}
