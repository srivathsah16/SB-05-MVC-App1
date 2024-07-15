package com.srivath.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/greet")
    public ModelAndView greet() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hi, Greetings!!!");
        mv.setViewName("message");
        return mv;
    }

    @GetMapping("/welcome")
    public ModelAndView welcome() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hi, Welcome!!!");
        mv.setViewName("message");
        return mv;
    }

}
