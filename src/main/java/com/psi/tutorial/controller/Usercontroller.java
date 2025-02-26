package com.psi.tutorial.controller;

import com.psi.tutorial.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Usercontroller {

    @GetMapping("/api/users")
    public List<String> getUsers(){
        return List.of("권민재", "류현준", "김준영");
    }

    @PostMapping("/api/user")
    public UserDTO createUser(@RequestBody UserDTO user){
        System.out.println("이름 : " + user.getName());
        System.out.println("나이 : " + user.getAge());

        return user;
    }
}
