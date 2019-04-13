package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	private  UserService userService;

    @ResponseBody
    @RequestMapping(value = "/indexs",method = {RequestMethod.GET})
    public String home() {
    	User user = this.userService.findUserById("1");
    	String back = user.getId() + user.getName() + user.getAge();
        return back;
    }
    
    @RequestMapping(value = "/index1")
    public ModelAndView index() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("index");
        return model;
    }

}
