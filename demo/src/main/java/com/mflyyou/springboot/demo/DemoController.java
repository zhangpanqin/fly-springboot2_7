package com.mflyyou.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    @GetMapping("/hello-world")
    public Map<String, String> helloWorld() {
        Map<String, String> res = new HashMap<>();
        res.put("aa", "bb");
        return res;
    }
}
