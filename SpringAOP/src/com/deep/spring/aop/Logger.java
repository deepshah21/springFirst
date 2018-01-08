package com.deep.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("args(int)")
	public void cameraSnap(){
		
	}
	
	@Before("cameraSnap()")
	public void beforeAdvice(){
		System.out.println("About to take a photo ....");
	}
	
	/*@After("cameraSnap()")
	public void afterAdvice(){
		System.out.println("after advice ..");
	}
	
	@AfterReturning("cameraSnap()")
	public void afterReturningAdvice(){
		System.out.println("after successfully returning without an error..");
	}
	
	@AfterThrowing("cameraSnap()")
	public void afterThroewing(){
		System.out.println("after throwing an Error");
	}
	
	@Around("cameraSnap()")
	public void around(ProceedingJoinPoint p){
		System.out.println("before joint point ");
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("after joint point");
	}*/
	
	
}
