package com.megacorp.megafood;

import com.megacorp.megafood.notificator.NotificationEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {
    @Bean
    public NotificationEmail notificationEmail() {
        NotificationEmail notificador = new NotificationEmail("smtp.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }


}
