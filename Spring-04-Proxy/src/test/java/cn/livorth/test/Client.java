package cn.livorth.test;

import cn.livorth.Service.UserService;
import cn.livorth.Service.UserServiceImpl;
import cn.livorth.Utils.ProxyInvocationHandler;

public class Client {
    public static void main(String[] args) {
        // 创建需要代理的对象
        UserServiceImpl userService = new UserServiceImpl();
        // 创建代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置需要代理的对象
        pih.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) pih.getTarget();

        // 通过代理类调用被代理对象的方法
        proxy.add();

    }
}
