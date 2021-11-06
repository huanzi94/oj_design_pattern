package proxymode.staticproxy;

public class ModelALogin implements Login {
    @Override
    public void login() {
        System.out.println("登陆成功！");
    }
}
