package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class logBeforeAdvice implements MethodBeforeAdvice{ // before은 MethodBeforeAdvice
	
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("중요업무 전 사용될 로직");
		
	}

}
