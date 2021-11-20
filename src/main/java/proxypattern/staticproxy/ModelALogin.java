package proxypattern.staticproxy;

/**
 * ModelA的登录逻辑实现
 */
public class ModelALogin implements Login {
    @Override
    public void login() {
        System.out.println("登陆成功！");
    }
}
