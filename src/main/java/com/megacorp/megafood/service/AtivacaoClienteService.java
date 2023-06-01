package com.megacorp.megafood.service;

import com.megacorp.megafood.model.Client;
import com.megacorp.megafood.notificator.Notificador;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService: " + notificador);
    }

    public void ativar(Client client) {
        client.ativar();

        notificador.notificar(client, "Seu cadastro no sistema está ativo");
    }
}