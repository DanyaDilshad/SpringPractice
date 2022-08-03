package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(com.aop..*")
    public void authenticatingPointCut(){


    }

    @Pointcut("within(com.aop..*")
    public void authorizationPointCut(){


    }

    @Before("authenticatingPointCut()" && /"authorizationPointCut()")
    public void authenticate(){


    }
}

