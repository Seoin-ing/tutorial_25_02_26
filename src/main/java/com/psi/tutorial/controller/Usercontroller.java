package com.psi.tutorial.controller;

import com.psi.tutorial.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//해당 클래스는 컨트롤러야
public class Usercontroller {

    @GetMapping("/home/main")
    //대상이 /home/main 요청을 보내면 아래 메서드 실행
    @ResponseBody
    public String showHome(){
        return "안녕하세요";
    }

    @GetMapping("/home/main2")
    //대상이 /home/main 요청을 보내면 아래 메서드 실행
    @ResponseBody
    public String showHome2(){
        return "반갑습니다";
    }
    @GetMapping("/home/main3")
    //대상이 /home/main 요청을 보내면 아래 메서드 실행
    @ResponseBody
    public String showHome3(){
        return "스프링부트 최공";
    }

    @PostMapping("/api/user")
    public UserDTO createUser(@RequestBody UserDTO user){
        System.out.println("이름 : " + user.getName());
        System.out.println("나이 : " + user.getAge());

        return user;
    }
}
