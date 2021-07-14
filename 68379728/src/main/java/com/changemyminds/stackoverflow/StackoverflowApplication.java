package com.changemyminds.stackoverflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StackoverflowApplication {
    public static void main(String[] args) {
        SpringApplication.run(StackoverflowApplication.class, args);
    }

    // java -jar -Dspring.config.additional-location=file:./my-config/local-settings.yml build/libs/stackoverflow-0.0.1-SNAPSHOT.jar
}
