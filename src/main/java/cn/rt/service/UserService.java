package cn.rt.service;

import cn.rt.entity.User;

import java.util.List;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/18 9:21
 * Editored:
 */
public interface UserService {

    String getUserNameById(int id);

    int createUser();

    List<User> pageUser(int pageNum, int pageSize);

}
