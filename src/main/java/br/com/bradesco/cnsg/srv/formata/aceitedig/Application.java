package br.com.bradesco.cnsg.srv.formata.aceitedig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application class.
 * 
 * This class serves as the entry point for the Spring Boot application
 * and includes the necessary annotations to enable auto-configuration.
 */
@SpringBootApplication
public class Application {

    /**
     * Main method that starts the Spring Boot application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}