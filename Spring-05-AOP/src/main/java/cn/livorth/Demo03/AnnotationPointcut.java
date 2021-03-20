package cn.livorth.Demo03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointcut {
    @Before("execution(* cn.livorth.Service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("==========方法执行前============");
    }

    @After("execution(* cn.livorth.Service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("==========方法执行后============");
    }

    @Around("execution(* cn.livorth.Service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕前");
        System.out.println("签名:"+joinPoint.getSignature());
        //执行目标方法proceed
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
