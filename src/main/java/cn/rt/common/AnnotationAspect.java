package cn.rt.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/04 15:02
 * Editored:
 */
@Aspect
@Component
public class AnnotationAspect {

    @Around(value = "@annotation(saySomething)")
    public Object doSaySomething(ProceedingJoinPoint pjp, SaySomething saySomething) throws Throwable {
        System.out.println(saySomething.forWho() + saySomething.content());
        System.out.println("hhhhhhhhh");
        pjp.proceed();
        return null;
    }

}
