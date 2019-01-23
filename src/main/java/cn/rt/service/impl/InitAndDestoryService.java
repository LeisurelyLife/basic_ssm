package cn.rt.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/23 9:59
 * Editored:
 */
//@Service
//public class InitAndDestoryService implements InitializingBean, DisposableBean {
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("执行DisposableBean接口的destroy方法");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("执行InitializingBean接口的afterPropertiesSet方法");
//    }
//}

//@Service
public class InitAndDestoryService {
    @PostConstruct
    public void initPostConstruct(){
        System.out.println("执行PostConstruct注解标注的方法");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("执行preDestroy注解标注的方法");
    }

}
