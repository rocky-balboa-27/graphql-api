package com.sinha.aditya.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sinha.aditya.graphql")
public class GraphQLApp {
    public static void main(String[] args) {
        SpringApplication.run(GraphQLApp.class, args);
    }
}
