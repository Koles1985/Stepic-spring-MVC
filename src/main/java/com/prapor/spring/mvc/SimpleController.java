package com.prapor.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

@Controller
public class SimpleController {

    @RequestMapping("/")
    public String getFirstView(){
        return "first-view";
    }

    @RequestMapping("/askName")
    public String askName(){
        return "ask-emp-name-view";
    }

//    @RequestMapping("/showName")
//    public String showName(){
//        return "show-employee-name-view";
//    }

    @RequestMapping("/showName")
    public String showName(HttpServletRequest request, Model model){
        String name = request.getParameter("slaveName");
        name += " - employee Evil corporation";
        model.addAttribute("additionName", name);
        model.addAttribute("nowDate", LocalDateTime.now());
        return "show-employee-name-view";
    }
}
