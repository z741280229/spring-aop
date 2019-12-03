package com.zeno.study.util;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @program: spring-aop-xml
 * @description:
 * @author: Zeno
 * @create: 2019-12-03 15:35
 **/
public class Logger {

    /**
     * 前置通知
     */
    public void beforePrintLog(){
        System.out.println("前置通知......开始记录日志");
    }

    /**
     * 后置通知
     */
    public void afterReturnPrintLog(){
        System.out.println("后置通知......开始记录日志");
    }

    /**
     * 异常通知
     */
    public void afterThrowingPrintLog(){
        System.out.println("异常通知......开始记录日志");
    }

    /**
     * 最终通知
     */
    public void afterPrintLog(){
        System.out.println("最终通知......开始记录日志");
    }

    /**
     * 环绕通知
     * 问题：
     *      当我们配置环绕通知之后，切入点方法没有执行，而通知方法执行了
     * 分析：
     *      通过对比的动态代理中的环绕通知代码，发现动态代理的环绕通知有明确的切入点方法调用，而我们的代理中没有
     * 解决：
     *      Spring框架为我们提供了一个接口，ProceedingJoinPoint。该接口有一个方法proceed(),此方法就相当于明确调用切入点方法。
     *      该接口可以作为环绕通知的方法参数，在程序执行时，Spring框架会为我们提供该接口的实现类供我们使用
     *
     * Spring中的环绕通知：
     *      它是Spring框架为我们提供的一种可以在代码中手动控制增强方法何时执行的方式
     * @param point
     */
    public Object arroundPrintLog(ProceedingJoinPoint point) {
        Object value = null;
        try{
            //得到方法所需要的参数
            Object[] args = point.getArgs();
            System.out.println("前置通知......开始记录日志");
            //明确调用业务层方法（切入点方法）
            point.proceed(args);
            System.out.println("后置通知......开始记录日志");

        }catch (Throwable t){
            System.out.println("异常通知......开始记录日志");
            throw new RuntimeException(t);
        }finally {
            System.out.println("最终通知......开始记录日志");
        }
        return value;
    }

}
