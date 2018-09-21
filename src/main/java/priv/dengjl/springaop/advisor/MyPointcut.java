package priv.dengjl.springaop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * 重写名称匹配的匹配方法，往里面添加一个自定义的匹配方法<br/>
 * 
 * 方法名由xml配置，注入
 * @author it
 */
public class MyPointcut extends NameMatchMethodPointcut {

	private static final long serialVersionUID = -1076837083973701323L;
	
	// 增加一个自定义匹配名字
	private String addMappingName;
	
	public void setAddMappingName(String addMappingName) {
		this.addMappingName = addMappingName;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		// 向匹配队列中添加一个自定义的名字
		// 即 List<String> mappedNames = new ArrayList<>();
		this.setMappedName(addMappingName);
		
		return super.matches(method, targetClass);
	}
}
