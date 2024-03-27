package com.vlsystem.api.email;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@TestConfiguration
public class TestMailSenderConfig {
    @Bean
    JavaMailSender javaMailSender() {
        return new JavaMailSenderImpl();
    }
}
