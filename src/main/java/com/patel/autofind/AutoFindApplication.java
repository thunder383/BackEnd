package com.patel.autofind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AutoFindApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoFindApplication.class, args);
    }

}

