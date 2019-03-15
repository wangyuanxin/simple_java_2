package com.ease.archiecture.webcore;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String testWeb() {
        return "test";
    }
}