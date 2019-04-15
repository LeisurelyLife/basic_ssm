package cn.rt.controller;

import cn.rt.entity.User;
import cn.rt.entity.UserExtend;
import cn.rt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/18 9:24
 * Editored:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserNameById")
    @ResponseBody
    public String getUserNameById(int id) {
        String userName = userService.getUserNameById(id);
        return userName;
    }

    @RequestMapping(value = "/createUser")
    @ResponseBody
    public int createUser() {
        Integer count = userService.createUser();
        User user = new User();
        user.setId(count);
        return count;
    }

    @RequestMapping(value = "/getUserExtend")
    @ResponseBody
    public List getUserExtend() {
        List<UserExtend> userExtend = userService.getUserExtend();
        return userExtend;
    }

}
