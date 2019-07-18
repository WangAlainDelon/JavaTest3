package com.wx.exam1.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @Pointcut("execution(* com.wx.exam1.service.imp.FilmServiceImp.insert(..))")
    private void BeforeInsertFilmEvent() {
    }

    @Pointcut("execution(* com.wx.exam1.service.imp.FilmServiceImp.insert(..))")
    private void AfterInsertFilmEvent() {
    }


    // 前置增强：在目标方法执行之前执行.
    @Before("MyAspect.BeforeInsertFilmEvent()")
    public void before() {
        System.out.println("Before Insert Film Data");
    }

    //后置增强：在目标方法执行之后执行.
    @AfterReturning("MyAspect.AfterInsertFilmEvent()")
    public void afterreturning() {
        System.out.println("After Insert Film Data");
    }

}
