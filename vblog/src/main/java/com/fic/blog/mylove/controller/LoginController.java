package com.fic.blog.mylove.controller;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session) {
        if (username.equals("admin") && password.equals("12345")) {
            map.put("msg","登录成功");
            session.setAttribute("username",username);
            return "redirect:/home.html";
        } else {
            map.put("msg","用户名或者密码错误");
            return "login";
        }
    }
}
