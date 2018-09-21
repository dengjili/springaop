package priv.dengjl.proxy.bean;

/**
 * 业务代码，普通业务开发员工编写
 * 
 * @author it
 */
public class PersonService implements IPersonService {
	
	@Override
	public void sayHello() {
		System.out.println("sayHello");
	}
	
	@Override
	public void printName() {
		System.out.println("printName");
	}
	
	@Override
	public void test() {
		System.out.println("test");
		throw new RuntimeException("抛出测试异常!!!");
	}
}
