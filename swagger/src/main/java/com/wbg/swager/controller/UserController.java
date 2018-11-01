package com.wbg.swager.controller;

import com.wbg.swager.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.POST)
    public String Create() {
        return "";
    }

    @RequestMapping(value = "/createWithArray", method = RequestMethod.POST)
    public String createWithArray() {
        return "";
    }

    @RequestMapping(value = "/createWithList", method = RequestMethod.POST)
    public String createWithList() {
        return "";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        return "";
    }

    @RequestMapping(value = "/loginlogout", method = RequestMethod.GET)
    public String loginlogout() {
        return "";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String getusername(@PathVariable("username") String username) {
        return "";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.PUT)
    public String putusername(@PathVariable("username") String username) {
        return "";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.DELETE)
    public String delusername(@PathVariable("username") String username) {

        return "";
    }
}
