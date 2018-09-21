package priv.dengjl.springaop.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class TestBeforeAdvice implements MethodBeforeAdvice
{
	@Override
	public void before(Method method, Object[] args, Object target)
		throws Throwable {
		System.out.println("前置通知【方法1】!!!,执行方法前");
	}
}
