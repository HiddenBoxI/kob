package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/pk/")
public class BotInforController {
    @RequestMapping("botinfor/")
//    public List<String> getBotInfor(){
//        List<String> list = new LinkedList<>();
//        list.add("tiger");
//        list.add("tiger");
//        list.add("apple");
//        return list;
//    }
    public List<Map<String, String>> getBotInfor() {
        List<Map<String,String >> list = new LinkedList<>();
        Map<String, String> bot1 = new HashMap<>();
        bot1.put("name", "tiger");
        bot1.put("rating", "1500");
        list.add(bot1);
        return list;
    }
}