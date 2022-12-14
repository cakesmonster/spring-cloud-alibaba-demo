package com.cakemonster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * VideoApplication
 *
 * @author cakemonster
 * @date 2022/9/10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class VideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class, args);
    }
}
