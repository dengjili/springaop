package priv.dengjl.proxy.test;

import priv.dengjl.proxy.bean.IPersonService;
import priv.dengjl.proxy.bean.PersonService;
import priv.dengjl.proxy.highproxy.StaticPersonServiceProxy;

public class AppStaticProxy {
	public static void main(String[] args) {
		
		IPersonService service = new PersonService();
		//静态代理类
		IPersonService serviceProxy = new StaticPersonServiceProxy(service); 
		System.out.println("====================");
		serviceProxy.sayHello();
		System.out.println("====================");
		serviceProxy.printName();
		System.out.println("====================");
		serviceProxy.test();
		System.out.println("====================");
	}
}
