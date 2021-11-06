package proxymode.cglbproxy;


import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        ModelALogin proxyModelALogin = new ProxyModelALogin(new ModelALogin(), "张三");
        System.out.println("--------------------使用CGLIB动态代理模式");
        proxyModelALogin.;
    }
}

