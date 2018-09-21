package priv.dengjl.aspectj.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ServiceAspectjXml {
	
	public void logBefore(JoinPoint point) {

		System.out.println("Before() 正在运行!");
		System.out.println("当前方法 : " + point.getSignature().getName());
	}
	

	public void afterAdvice() {
		System.out.println("after() 正在运行!");
	}
	
	public void afterThrowing(Throwable error) {
		System.out.println("异常返回信息:" + error.getMessage());
	}
	
	public void afterReturning(JoinPoint joinPoint,Object result) {
		System.out.println("返回值信息:" + result);
	}
	
	public void testAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("前");
		joinPoint.proceed();
		System.out.println("后");
	}
}
