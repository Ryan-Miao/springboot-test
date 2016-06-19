package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by miaorf on 2016/6/19.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(Model model){

        model.addAttribute("name","Ryan");

        return "index";
    }


    @RequestMapping("/json")
    @ResponseBody
    public Map json(){
        Map map = new HashMap();
        map.put("name","Ryan");
        map.put("age","18");
        map.put("sex","man");
        return map;
    }
}
