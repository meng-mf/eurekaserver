package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName Test2ClientApplication
 * @Description: TODO
 * @Author mf
 * @Date 2019/11/30
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class TestClient2Application {
    public static void main(String[] args){

        SpringApplication.run(TestClient2Application.class,args);

    }
}
