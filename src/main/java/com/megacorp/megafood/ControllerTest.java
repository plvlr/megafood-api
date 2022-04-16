package com.megacorp.megafood;

import com.megacorp.megafood.model.Client;
import com.megacorp.megafood.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest {

    private AtivacaoClienteService ativacaoClienteService;

    public ControllerTest(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("ControllerTest: " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {

        Client joao = new Client("Joao", "joao@gmail.com", "11 2456 3566");

        ativacaoClienteService.ativar(joao);

        return "Hello";
    }
}