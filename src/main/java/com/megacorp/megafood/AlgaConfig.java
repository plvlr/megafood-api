package com.megacorp.megafood;

import com.megacorp.megafood.notificator.NotificationEmail;
import com.megacorp.megafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AlgaConfig {

    @Bean
    public NotificationEmail notificationEmail() {
        NotificationEmail notificador = new NotificationEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacao() {
        return new AtivacaoClienteService(notificationEmail());
    }
}
