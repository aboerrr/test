package com.yhb.controller;

import com.alibaba.fastjson.JSONObject;
import com.sun.javafx.collections.MappingChange;
import com.yhb.vo.Vo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test1")
    @ResponseBody
    public List<Map<String,Object>> sentToWeb(@RequestBody JSONObject jsonObject){

        System.out.println("adfasdfsd");
        System.out.println("test1");

        List<Vo> vo = jsonObject.getJSONArray("vo").toJavaList(Vo.class);
        Map<String, Object> map;
        List<Map<String,Object>> objects = new ArrayList<>();;

        for (Vo vo1 : vo) {
            map = new HashMap<>();

            map.put("编号",vo1.getId());
            map.put("姓名",vo1.getName());
            map.put("年龄",vo1.getAge());
            map.put("身高",vo1.getSize());
            objects.add(map);
        }
        return objects;
    }
//@RequestMapping("/test1")
//@ResponseBody
//public List<Map<String,Object>> sentToWeb(@RequestBody JSONObject json){
//    List<Vo> vo = json.getJSONArray("vo").toJavaList(Vo.class);
//    Map<String, Object> map;
//    List<Map<String,Object>> objects = new ArrayList<>();;
//
//    for (Vo vo1 : vo) {
//        map = new HashMap<>();
//
//        map.put("编号",vo1.getId());
//        map.put("姓名",vo1.getName());
//        map.put("年龄",vo1.getAge());
//        map.put("身高",vo1.getSize());
//        objects.add(map);
//    }
//    return objects;
//}
}
