package com.cnkonica.example.dubbo.consumer.test;


import base.GlobalResponse;
import com.alibaba.fastjson.JSON;
import com.cnkonica.dubbo.consumer.Application;
import com.cnkonica.example.api.ApiTestServiceFacade;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class consumerTest {
    @Resource
    private ApiTestServiceFacade apiTestServiceFacade;

    @Test
    public void testApi(){
        GlobalResponse<String> response = apiTestServiceFacade.run();
        log.info("{}", JSON.toJSONString(response));
    }
}
