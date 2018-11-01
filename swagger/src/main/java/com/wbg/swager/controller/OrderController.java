package com.wbg.swager.controller;

import com.wbg.swager.entitys.Order;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(value = "/sele",method = RequestMethod.POST)
    @ResponseBody
    public String select(@RequestBody Order order){
        System.out.println(order);
        return "";
    }
    @RequestMapping(value = "/seles",method = RequestMethod.POST)
    public String selects(Order order, BindingResult br){
        System.out.println(order);
        return "";
    }
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
