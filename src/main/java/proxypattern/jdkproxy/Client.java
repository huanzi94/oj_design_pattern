package proxypattern.jdkproxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Login modelALogin = new ModelALogin();
        Login instance = (Login) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{Login.class},
                new ProxyModelALogin(modelALogin, "张三"));

        System.out.println("--------------------使用JDK动态代理模式");
        instance.login();
    }
}

