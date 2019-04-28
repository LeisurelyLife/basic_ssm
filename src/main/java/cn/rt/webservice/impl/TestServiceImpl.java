package cn.rt.webservice.impl;

import cn.rt.webservice.TestService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @author ruanting
 * @date 2019/04/28
 */
@WebService
@Component
public class TestServiceImpl implements TestService {
    @Override
    public String say(String name) {
        return "hello " + name;
    }
}
