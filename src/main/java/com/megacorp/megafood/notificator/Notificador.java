package com.megacorp.megafood.notificator;

import com.megacorp.megafood.model.Client;

public interface Notificador {
    void notificar(Client client, String mensagem);
}
