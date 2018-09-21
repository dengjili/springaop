package priv.dengjl.proxy.highproxy;

import priv.dengjl.proxy.bean.IPersonService;
import priv.dengjl.proxy.bean.PersonService;

/**
 * 系统控制，由高级业务人员编写
 * 
 * 这里简单处理，直接继承PersonService，
 * 使StaticPersonServiceProxy与PersonService保持类型一致，也可以不继承
 * 
 * 这里是为了简化代码，未用接口
 * 
 * @author it
 */
public class StaticPersonServiceProxy extends PersonService {
	
	private IPersonService service;

	public StaticPersonServiceProxy(IPersonService service) {
		this.service = service;
	}

	@Override
	public void sayHello() {
		System.out.println("dobefore");
		service.sayHello();
		System.out.println("doafter");
	}

	@Override
	public void printName() {
		System.out.println("dobefore");
		service.printName();
		System.out.println("doafter");
	}

	@Override
	public void test() {
		System.out.println("dobefore");
		try {
			service.test();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("doException");
		}
		System.out.println("doafter");
	}
	
	
	
}
