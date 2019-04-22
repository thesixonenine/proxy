package io.github.thesixonenine.direct;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author simple
 * @date 2018/3/21 18:19
 */
@Aspect
@Component
public class MonitorAdvice {

    @Pointcut("execution (* io.github.thesixonenine.direct.Speakable.*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        MonitorSession.begin(pjp.getSignature().getName());
        pjp.proceed();
        MonitorSession.end();
    }
}
