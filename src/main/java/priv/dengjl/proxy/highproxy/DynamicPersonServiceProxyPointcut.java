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
public class DynamicPersonServiceProxyPointcut implements InvocationHandler {
	
	private IPersonService service;

	public DynamicPersonServiceProxyPointcut(IPersonService service) {
		this.service = service;
	}
	
	/**
	 * 代理了PersonService类中的printName方法
	 * 
	 * @Override
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		String name = method.getName();
		
		// 只代理printName方法
		if ("printName".equals(name)) {
			Object object = null;
			System.out.println("dobefore");
			try {
				object = method.invoke(service, args);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("doException");
			}
			System.out.println("doafter");
			return object;
		} else {
			return method.invoke(service, args);
		}
		
	}
	
	
	
}
