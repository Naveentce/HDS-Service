package com.innova.hds.login;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private LoginService loginService;

    @RequestMapping("/greeting")
    public UserInfo greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new UserInfo(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/doLogin")
    @CrossOrigin(origins = "http://localhost:4200")
    public LoginResponse doLogin() {
    	System.out.println("Called fromn ANgular");
        return new LoginResponse(200);
    }
    
}
