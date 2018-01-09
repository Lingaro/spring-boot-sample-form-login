package com.example.webappboilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean /* see http://www.baeldung.com/spring-git-information */
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer gitInfo = new PropertySourcesPlaceholderConfigurer();
        gitInfo.setLocation(new ClassPathResource("git.properties"));
        gitInfo.setIgnoreResourceNotFound(true);
        gitInfo.setIgnoreUnresolvablePlaceholders(true);
        return gitInfo;
    }
}
