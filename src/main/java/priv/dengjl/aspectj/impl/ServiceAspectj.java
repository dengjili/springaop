package priv.dengjl.aspectj.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServiceAspectj {
	
	@Before("execution(* priv.dengjl.springaop.service.*.printName(..))")
	public void logBefore(JoinPoint point) {

		System.out.println("Before() 正在运行!");
		System.out.println("当前方法 : " + point.getSignature().getName());
	}
	

	@After("execution(* priv.dengjl.springaop.service.*.printURL(..))")
	public void beforeAdvice() {
		System.out.println("after() 正在运行!");
	}
	
	@AfterThrowing(pointcut = "execution(* priv.dengjl.springaop.service.*.printThrowException(..))", throwing= "error")
	public void afterThrowing(Throwable error) {
		System.out.println("异常返回信息:" + error.getMessage());
	}
	
	@AfterReturning(pointcut = "execution(* priv.dengjl.springaop.service.*.returnValue(..))", returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result) {
		System.out.println("返回值信息:" + result);
	}
	
	@Around("execution(* priv.dengjl.springaop.service.*.testAroud(..))")
	public void testAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("前");
		joinPoint.proceed();
		System.out.println("后");
	}
}
