package priv.dengjl.springaop.aop;

import org.springframework.aop.ThrowsAdvice;

public class TestThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("抛出异常后，处理！！！");
	}
}
