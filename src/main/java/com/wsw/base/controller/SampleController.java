package com.wsw.base.controller;

import com.wsw.base.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {

    private Map<String,Object> params = new HashMap<>();

    @RequestMapping("/test/home")
    public String home() {
        return "haha";
    }

    @RequestMapping("/test")
    public Map<String,String> testMap(){
    	Map<String,String> map = new HashMap<>();
    	map.put("name", "xdclass");
    	return map;
    }
    
    
    @GetMapping("/testjson")
    public Object testjson(){
    	
    	return new User(111, "abc123", "10001000", new Date());
    }

    @PostMapping("/v1/login")
    public Object login(String id, String pwd){
        params.clear();
        params.put("id", id);
        params.put("pwd", pwd);
        return params;
    }


    @PutMapping("/v1/put")
    public Object put(String id){
        params.clear();
        params.put("id", id);
        return params;
    }


    @DeleteMapping("/v1/del")
    public Object del(String id){
        params.clear();
        params.put("id", id);
        return params;
    }
    
    
}