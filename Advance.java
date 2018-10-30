package aop;

import org.aspectj.lang.JoinPoint;

public class Advance {
    public void beforeTest(JoinPoint jp){
        System.out.println("前置");
    }
    public void afterTest(JoinPoint jp){
        System.out.println("后置");
    }
}
