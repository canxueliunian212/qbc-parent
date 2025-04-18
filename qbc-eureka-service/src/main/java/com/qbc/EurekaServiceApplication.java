package com.qbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Service Registry Center Starter
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}
