package priv.dengjl.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.dengjl.springaop.service.TestService;

public class AppXml {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContextAspectjXml.xml" });

    	TestService cust = (TestService) appContext.getBean("testService");

		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		try {
			cust.printThrowException();
		} catch (Exception e) {
			System.out.println("有异常发生");
			System.out.println("*************************");
		}
		cust.returnValue();
		
		cust.testAroud();
	}

}
