package cn.rt.controller;

import cn.rt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/18 9:07
 * Editored:
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/toIndex")
    public String toIndex() {
        return "index";
    }

    @RequestMapping(value = "/getString")
    @ResponseBody
    public String getString() {
        System.out.println(System.identityHashCode(userService));
        return "index string";
    }

}
