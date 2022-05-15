package io.github.edu2805;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development // anotação criada
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Rodando a configuração de desenvolvimento");
        };
    }
}
