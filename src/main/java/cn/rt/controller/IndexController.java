package cn.rt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/18 9:07
 * Editored:
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/toIndex")
    public String toIndex() {
        return "index";
    }

    @RequestMapping(value = "/getString")
    public String getString() {
        return "index string";
    }

}
