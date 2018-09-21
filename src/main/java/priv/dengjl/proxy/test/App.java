package priv.dengjl.proxy.test;

import priv.dengjl.proxy.bean.IPersonService;
import priv.dengjl.proxy.bean.PersonService;

public class App {
	public static void main(String[] args) {
		
		IPersonService service = new PersonService();
		System.out.println("====================");
		service.sayHello();
		System.out.println("====================");
		service.printName();
		System.out.println("====================");
		service.test();
		System.out.println("====================");
	}
}
