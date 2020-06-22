package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("消息放到队列里");
        for (int i = 0; i < 5; i++) {
            String msg = "msg" + i;

        }
    }

}
