package com.aprj.controller;

//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wyp0596 on 06/03/2017.
 */
@Controller
public class MainController {

    @GetMapping(value = {"", "/home"})
    public String home(){
        return "home";
    }

//    @PreAuthorize("hasAnyAuthority('ADMIN')")
//    @GetMapping(value = "/helloadmin")
//    public String helloAdmin(){
//        return "helloAdmin";
//    }
//
//    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
//    @GetMapping(value = "/hellouser")
//    public String helloUser(){
//        return "helloUser";
//    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/403")
    public String forbidden(){
        return "403";
    }

    @RequestMapping("/404")
    public String notFound(){
        return "404";
    }
}
