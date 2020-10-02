package com.example.demo.controller;

import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2020/9/19.
 */
@RestController
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private DemoRepository demoRepository;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    private Object test(HttpServletRequest request) {

        return   demoRepository.findAll();
//        demoRepository.
    }
}
