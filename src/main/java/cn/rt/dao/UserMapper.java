package cn.rt.dao;

import cn.rt.entity.User;
import cn.rt.entity.UserExtend;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    List<UserExtend> getUserExtend();

}