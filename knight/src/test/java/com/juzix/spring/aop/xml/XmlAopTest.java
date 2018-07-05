package com.juzix.spring.aop.xml;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import static com.juzix.knight.common.Print.print;

public class XmlAopTest {
    private Logger log = Logger.getLogger(getClass());

    /**
     * 前置通知
     *
     * @param jp
     */
    public void beforeMethod(JoinPoint jp) {
        print("这是前置通知");
    }

    /**
     * 后置通知
     *
     * @param jp
     */
    public void afterMethod(JoinPoint jp) {
        print("这是一个后置通知");
    }

    /**
     * 返回后通知
     * @param jp
     * @param resultVal
     */
    public void afterReturnMethod(JoinPoint jp,Object resultVal) {
        log.info("这是返回后通知，returning: " + resultVal);
    }

    /**
     * 异常抛出后通知
     * @param jp
     * @param ex
     */
    public void afterThrowingMethod(JoinPoint jp,Throwable ex) {
        log.info("异常抛出后通知");
    }

    /**
     * 环绕通知
     * @param pjp
     * @throws Throwable
     */
    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        log.info("环绕通知前");
        pjp.proceed();
        log.info("环绕通知后");
    }

}