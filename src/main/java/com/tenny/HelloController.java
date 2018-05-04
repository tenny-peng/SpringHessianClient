package com.tenny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tenny
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private IHello helloHess;
    
    @RequestMapping(value = "/sayHello", method=RequestMethod.GET)
    public String sayHello(){
        String result =  helloHess.hello("tenny");
        System.out.println("client result: " + result);
        return result;
    }
    
}
