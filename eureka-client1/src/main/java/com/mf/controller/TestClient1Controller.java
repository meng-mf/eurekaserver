package com.mf.controller;

import com.mf.api.TestClient2Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestClient1Controller
 * @Description: TODO
 * @Author mf
 * @Date 2019/11/30
 * @Version V1.0
 **/
@RestController
public class TestClient1Controller {
    @Autowired
    private TestClient2Api testClient2Api;

    @RequestMapping("test01")
    public String test1(){
        String test01 = testClient2Api.test01();
        return test01;
    }
}
