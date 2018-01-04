package com.deep.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Before(value = "execution(void com.deep.spring.aop.Camera.snap())")
	public void aboutToTakePhoto(){
		System.out.println("About to take a photo ....");
	}
}
