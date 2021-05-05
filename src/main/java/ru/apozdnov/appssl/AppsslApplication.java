package ru.apozdnov.appssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;

@SpringBootApplication
public class AppsslApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppsslApplication.class, args);

    }

}
