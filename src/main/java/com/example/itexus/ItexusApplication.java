package com.example.itexus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication(exclude = {
        WebSocketServletAutoConfiguration.class,
        TaskSchedulingAutoConfiguration.class
})
public class ItexusApplication {

    private final Environment environment;

    public ItexusApplication(Environment environment) {
        this.environment = environment;
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ItexusApplication.class);
        Environment env = application.run(args).getEnvironment();
        log.info("""
                        ----------------------------------------------------------
                        \tApplication '{}' is running! Access URLs:
                        \tLocal: \t\t{}://localhost:{}{}
                        ----------------------------------------------------------""",
                env.getProperty("spring.application.name"), "http", env.getProperty("server.port"), "/user");
    }

}
