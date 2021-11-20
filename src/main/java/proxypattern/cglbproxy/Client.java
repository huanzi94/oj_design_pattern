package proxypattern.cglbproxy;


import net.sf.cglib.proxy.Enhancer;

public class Client {

    public static void main(String[] args) {
        System.out.println("--------------------使用CGLIB动态代理模式");
        ProxyModelALogin proxyModelALogin = new ProxyModelALogin(new ModelALogin(), "张三");
        ModelALogin login = (ModelALogin) Enhancer.create(ModelALogin.class, proxyModelALogin);
        login.login();
    }
}

