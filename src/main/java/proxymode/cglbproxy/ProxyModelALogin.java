package proxymode.cglbproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

public class ProxyModelALogin implements MethodInterceptor {

    private Object object;
    private String name;

    public ProxyModelALogin(Object object, String name) {
        this.object = object;
        this.name = name;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(name + "即将登陆系统");
        Object result = method.invoke(object, args);
        System.out.println(name + "登陆系统时间为" + new Date());
        return result;
    }
}
