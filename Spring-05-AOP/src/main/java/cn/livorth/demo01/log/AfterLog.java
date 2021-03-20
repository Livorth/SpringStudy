package cn.livorth.demo01.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    /**
     *
     * @param returnValue 被调用方法的返回值
     * @param method 被调用的方法
     * @param args 被调用的方法的对象的参数
     * @param target 被调用的目标对象
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + target.getClass().getName()
                +"的"+method.getName()+"方法,"
                +"返回值："+returnValue);
    }



}
