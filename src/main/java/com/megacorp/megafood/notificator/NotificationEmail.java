package com.megacorp.megafood.notificator;


import com.megacorp.megafood.model.Client;
import org.springframework.stereotype.Component;

@Component
public class NotificationEmail implements Notificador {

    public NotificationEmail() {
        System.out.println("NotificationEmail");
    }

    @Override
    public void notificar(Client client, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                client.getName(), client.getEmail(), mensagem);
    }
}
