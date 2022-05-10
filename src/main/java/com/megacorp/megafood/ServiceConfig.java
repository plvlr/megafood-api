package com.megacorp.megafood;

import com.megacorp.megafood.notificator.Notificador;
import com.megacorp.megafood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public AtivacaoClienteService ativacao(Notificador notificador) {
        return new AtivacaoClienteService(notificador);
    }
}