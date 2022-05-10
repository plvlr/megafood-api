package com.megacorp.megafood.notificator;


import com.megacorp.megafood.model.Client;
import org.springframework.stereotype.Component;

import java.util.Locale;

public class NotificationEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificationEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;

        System.out.println("NotificationEmail");
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

    @Override
    public void notificar(Client client, String mensagem) {
        if (this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n",
                client.getName(), client.getEmail(), this.hostServidorSmtp, mensagem);
    }
}
