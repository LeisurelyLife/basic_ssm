package cn.rt.dao;

import org.apache.ibatis.annotations.Param;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/18 10:01
 * Editored:
 */
public interface TestMapper {

    String getUserNameById(@Param("id") int id);

}
