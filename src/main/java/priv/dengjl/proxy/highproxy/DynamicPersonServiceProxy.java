package priv.dengjl.proxy.highproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import priv.dengjl.proxy.bean.IPersonService;

/**
 * 系统控制，由高级业务人员编写
 * 
 * 动态代理处理类
 * 
 * @author it
 */
public class DynamicPersonServiceProxy implements InvocationHandler {
	
	private IPersonService service;

	public DynamicPersonServiceProxy(IPersonService service) {
		this.service = service;
	}
	
	/**
	 * 代理了PersonService类所有方法，简化静态代理类
	 * 
	 * @Override
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("dobefore");
		try {
			return method.invoke(service, args);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("doException");
		}
		System.out.println("doafter");
		
		return null;
	}
	
	
	
}
