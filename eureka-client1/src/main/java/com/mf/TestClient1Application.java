package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName TestClient1Application
 * @Description: TODO
 * @Author mf
 * @Date 2019/11/30
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class TestClient1Application {
    public static void main(String[] args){

        SpringApplication.run(TestClient1Application.class,args);

    }
}
