package proxymode.staticproxy;



public class Client {

    public static void main(String[] args) {
        ModelALogin modelALogin = new ModelALogin();
        modelALogin.login();

        System.out.println("--------------------使用静态代理模式");
        ProxyModelALogin proxyModelALogin = new ProxyModelALogin(modelALogin, "张三");
        proxyModelALogin.login();
    }
}

