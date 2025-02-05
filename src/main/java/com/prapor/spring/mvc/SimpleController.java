package com.prapor.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
    public String showName(@RequestParam("slaveName") String name,
                           @RequestParam("slaveAge") int age,
                           Model model){
        name += " - slave Evil corporation";
        model.addAttribute("additionName", name);
        model.addAttribute("contractAge", age);
        model.addAttribute("nowDate", LocalDateTime.now());
        return "show-employee-name-view";
    }
}
