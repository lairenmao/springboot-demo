package cn.wind.jenkinsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/jenkins/test")
    public String test(){
        return "hello world";
    }

}
