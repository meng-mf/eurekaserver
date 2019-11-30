package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName TestServer1
 * @Description: TODO
 * @Author mf
 * @Date 2019/11/29
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class TestServer1 {
    public static void main(String[] args){

        SpringApplication.run(TestServer1.class,args);

    }
}
