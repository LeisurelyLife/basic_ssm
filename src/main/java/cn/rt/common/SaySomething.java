package cn.rt.common;

import java.lang.annotation.*;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/04 14:53
 * Editored:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface SaySomething {

    String content();//要说的内容
    String forWho();//说给谁

}
