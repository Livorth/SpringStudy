package cn.livorth.Utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    // 被 代理 的 接口
    private Object target;

    // 获取被代理的接口
    public void setTarget(Object target) {
        this.target = target;
    }

    //
    public Object getTarget(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }

    // 处理代理实例，返回其结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        // 还可以在这添加方法，进行代理的特有处理
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    public void log(String msg){
        System.out.println("好耶，是" + msg + "!!");
    }

}
