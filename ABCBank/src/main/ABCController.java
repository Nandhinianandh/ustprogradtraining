package com.example.ABCBank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
@Controller
public class ABCController {
        @RequestMapping("/")
        public String login(){
            return  "login";

        }
    @RequestMapping("/details")
    public String details(){
        return  "details";

    }
    }
