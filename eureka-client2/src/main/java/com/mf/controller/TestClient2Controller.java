package com.mf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestClient2Controller
 * @Description: TODO
 * @Author mf
 * @Date 2019/11/30
 * @Version V1.0
 **/
@RestController
public class TestClient2Controller {
    @RequestMapping("test2")
    public String testClient2(){
        return "testClient2";
    }
}
