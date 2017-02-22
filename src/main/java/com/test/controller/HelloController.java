package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/22 0022.
 */
@RestController
//RestController组合了@Controller and @ResponseBody，返回纯文本，而不是视图
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "hello boot";
    }
}
