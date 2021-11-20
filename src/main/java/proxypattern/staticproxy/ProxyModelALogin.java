package proxypattern.staticproxy;

import java.util.Date;

/**
 * ModelA的登录逻辑实现代理类
 */
public class ProxyModelALogin implements Login {

    private final ModelALogin modelALogin;
    private final String name;

    public ProxyModelALogin(ModelALogin modelALogin, String name) {
        this.modelALogin = modelALogin;
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println(name + "即将登陆系统");
        modelALogin.login();
        System.out.println(name + "登陆系统时间为" + new Date());
    }
}
