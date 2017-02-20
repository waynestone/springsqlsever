package com.wayne.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wayne.core.PropertyUtils;
//
@Controller
@RequestMapping("account")
public class AccountController{

    @ResponseBody
    @RequestMapping(value = "login", method = { RequestMethod.POST })
    public String login(HttpServletRequest request,HttpServletResponse response,
                      @RequestParam String username, @RequestParam String password)
        throws ServletException, IOException{
        String basePath = "";//PropertyUtils.getProperty("java.restaurant.url");
        String returnUrl = basePath+"/home/index";
        //response.sendRedirect(returnUrl);
        return returnUrl;
    }

    @ResponseBody
    @RequestMapping(value = "login", method = { RequestMethod.GET })
    public String login(){
        return "GET test";
    }


}