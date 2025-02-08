package com.prapor.spring.mvc;

import com.prapor.spring.mvc.model.Employee;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;

@Controller
//@RequestMapping("/slave")
public class SimpleController {

//    @RequestMapping("/")
//    public String getFirstView(){
//        return "first-view";
//    }
//
//    @RequestMapping("/askName")
//    public String askName(){
//        return "ask-emp-name-view";
//    }

//    @RequestMapping("/showName")
//    public String showName(){
//        return "show-employee-name-view";
//    }

//    @RequestMapping("/showName")
//    public String showName(@RequestParam("slaveName") String name,
//                           @RequestParam("slaveAge") int age,
//                           Model model){
//        name += " - slave Evil corporation";
//        model.addAttribute("additionName", name);
//        model.addAttribute("contractAge", age);
//        model.addAttribute("nowDate", LocalDateTime.now());
//        return "show-employee-name-view";
//    }

    @RequestMapping("/")
    public String getMainView(){
        return "main-view";
    }

    @RequestMapping("/infinity")
    public String blaebla(Model model){
        model.addAttribute("employee", new Employee());
        return "registration-form";

    }

    @RequestMapping("/showResult")
    public String eblaBlaBla(@Valid @ModelAttribute("employee")Employee employee, BindingResult bindingResult){
        String lang = "";
        for (String text : employee.getLanguages()){

            lang += text + ", ";
        }
        employee.setLanguage(lang);




        if(bindingResult.hasErrors()){
            return "registration-form";
        }else {
            return "show-employee-view";
        }
    }
}
