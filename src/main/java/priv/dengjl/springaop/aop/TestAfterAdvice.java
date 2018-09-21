package priv.dengjl.springaop.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class TestAfterAdvice implements AfterReturningAdvice
{
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("后置通知【方法1】!!!,执行方法后");
	}
}
