package priv.dengjl.springaop.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TestAroundMethod implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("TestAroundMethod环绕 before");
		try {
			Object result = methodInvocation.proceed();
			System.out.println("TestAroundMethod环绕 after");
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println("TestAroundMethod环绕 after异常");
			throw e;
		}
	}
}
