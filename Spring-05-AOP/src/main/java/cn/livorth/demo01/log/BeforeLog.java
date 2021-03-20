package cn.livorth.demo01.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 还必须要单独写个类
 */
public class BeforeLog implements MethodBeforeAdvice {
    @Override
    /**
     * 一个前置增强方法，在调用被执行方法之前调用（环绕的优先级更高）
     * @param method 要执行的目标对象的方法
     * @param objects 被调用的方法的参数
     * @param o 目标对象
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println( o.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
