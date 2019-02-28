package cn.rt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/02/27 15:01
 * Editored:
 */
@Controller
@RequestMapping("/ueditor")
public class UeditorController {

    @RequestMapping(value = "/toDemo")
    public String toDemo() {
        return "demo";
    }

}
