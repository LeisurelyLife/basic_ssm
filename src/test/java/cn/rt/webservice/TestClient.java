package cn.rt.webservice;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ruanting
 * @date 2019/04/28
 */
public class TestClient {

    public static void main(String[] args) {
        JaxWsDynamicClient();
        SpringClient();
    }

    /**
     * 动态代理客户端
     */
    public static void JaxWsDynamicClient() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:9999/ws/soap/hello");
        factory.setServiceClass(TestService.class);

        TestService helloService = factory.create(TestService.class);
        String result = helloService.say("world");
        System.out.println(result);
    }

    /**
     * 基于spring的客户端
     */
    public static void SpringClient() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-client.xml");

        TestService helloService = context.getBean("testService", TestService.class);
        String result = helloService.say("world");
        System.out.println(result);
    }

}
