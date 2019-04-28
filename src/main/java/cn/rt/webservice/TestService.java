package cn.rt.webservice;

import javax.jws.WebService;

/**
 * @author ruanting
 * @date 2019/04/28
 */
@WebService
public interface TestService {
    String say(String name);
}
