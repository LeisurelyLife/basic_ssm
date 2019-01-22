package cn.rt.service.impl;

import cn.rt.dao.TestMapper;
import cn.rt.dao.UserMapper;
import cn.rt.entity.User;
import cn.rt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/18 9:23
 * Editored:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUserNameById(int id) {
        String userName = testMapper.getUserNameById(id);
        System.out.println(userName);
        return userName;
    }

    @Override
    public int createUser() {
        User user = new User();
        user.setAddress("大甲");
        user.setBirthday(new Date());
        user.setSex("m");
        user.setUsername("01");
        int insert = userMapper.insert(user);
        if (true) {
            throw new NullPointerException();
        }
        return insert;
    }

}
