package priv.dengjl.proxy.test;

import java.lang.reflect.Proxy;

import priv.dengjl.proxy.bean.IPersonService;
import priv.dengjl.proxy.bean.PersonService;
import priv.dengjl.proxy.highproxy.DynamicPersonServiceProxyPointcut;

public class AppDynamicProxyPointCut {
	public static void main(String[] args) {

		IPersonService service = new PersonService();
		// 动态代理处理器,带有切面点的
		DynamicPersonServiceProxyPointcut serviceProxyHandler = new DynamicPersonServiceProxyPointcut(service);
		IPersonService serviceProxy =  (IPersonService) Proxy.newProxyInstance(serviceProxyHandler.getClass().getClassLoader(), service.getClass().getInterfaces(), serviceProxyHandler);
		
		System.out.println("====================");
		serviceProxy.sayHello();
		System.out.println("====================");
		serviceProxy.printName();
		System.out.println("====================");
		serviceProxy.test();
		System.out.println("====================");
	}
}
