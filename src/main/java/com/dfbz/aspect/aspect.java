package com.dfbz.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class aspect {
        Logger logger=Logger.getLogger(aspect.class);


    //切入点，execution：精确到方法
    @Pointcut("execution(* com.dfbz..*(..))")
    public void pc(){}//此方法等同于id

    @Before("pc()")
    public void before(){
//        System.out.println("----执行方法前----");
        logger.info("----执行方法前----");
    }

    @AfterReturning("pc()")
    public void afterreturning(){
        System.out.println("--方法结束后--");    //没有异常才执行
    }

    @After("pc()")
    public void after(){
        System.out.println("==最终执行==");       //不管有没有异常
    }

    @AfterThrowing(pointcut = "pc()",throwing = "e")
    public void afterthrowing(Exception e){
        System.out.println("--异常了--");
    }
}
