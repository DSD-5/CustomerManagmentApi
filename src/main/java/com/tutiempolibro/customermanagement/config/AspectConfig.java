package com.tutiempolibro.customermanagement.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 
 * @Author:
 * @Datecreation: 03 abr. 2020
 * @FileName: AspectConfig.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Clase donde se configura los pointcut de la clase
 *               LoggingAspect.
 */

@Aspect
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true,exposeProxy = true)
public class AspectConfig {



    @Pointcut("execution(public * com.tutiempolibro.customermanagement.service..*.*(..))")
    public void logServiceMethod() {
    }

}