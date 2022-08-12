package com.patel.autofind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
@RequestMapping(value={"", "/","/home"})
    public ModelAndView Index() {
    ModelAndView mav = new ModelAndView("index");
    //mav.addObject("key",1);
        return mav;
    }
    @RequestMapping("/ourfleet")
    public ModelAndView Ourfleet() {
        ModelAndView mav = new ModelAndView("ourfleet");
        return mav;
    }
    @RequestMapping("/about")
    public ModelAndView About() {
        ModelAndView mav = new ModelAndView("about");
        return mav;
    }
    @RequestMapping("/contact")
    public ModelAndView Contact() {
        ModelAndView mav = new ModelAndView("contact");
        return mav;
    }
}
