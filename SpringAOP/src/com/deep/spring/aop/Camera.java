package com.deep.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {

		public void snap() throws Exception{
			System.out.println("SNAP !");
			throw new Exception("hello");
		}
		
		public void snapInt(int p){
			System.out.println(p);
		}
}
