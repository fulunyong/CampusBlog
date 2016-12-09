package com.gxuwz.campus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fulunyong on 2016/12/9 12:08
 */
@RestController
public class Test {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello word! spring boot";
    }
}
