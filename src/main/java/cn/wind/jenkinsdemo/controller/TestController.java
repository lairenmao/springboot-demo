package cn.wind.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping("/jenkins/test")
    public String test(){
        return "hello world";
    }
    @PostMapping("/get/typeIds")
    public void test2(@RequestParam("ids") int[] ids){
        System.out.println(Arrays.toString(ids));

    }
    @PostMapping("/get/ids")
    public void test3(@RequestBody int[] ids){
        System.out.println(Arrays.toString(ids));

    }
    @PostMapping("/get/list")
    public void test4(@RequestBody List<Integer> ids){
        System.out.println(ids);
    }
    @PostMapping(value = "/str", consumes = "application/json")
    @ResponseBody
    public String str(@RequestParam("name") String aa,@RequestBody String name){
        System.out.println(aa);
        System.out.println(name);
        return "success";
    }

}
