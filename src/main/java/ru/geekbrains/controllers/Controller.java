package ru.geekbrains.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.services.UserService;


@RestController
@RequiredArgsConstructor
public class Controller {

    private final UserService userService;


    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("management/index")
    public String managementIndex() {
        return "management";
    }

    @GetMapping("admin/index")
    public String adminIndex() {
        return "admin";
    }

    @GetMapping("profile/index")
    public String profileIndex() {
        return "profile";
    }

    @GetMapping("api/public/test1")
    public String test1() {
        return "Test 1";
    }

    @GetMapping("api/public/test2")
    public String test2() {
        return "Test 2";
    }


}
