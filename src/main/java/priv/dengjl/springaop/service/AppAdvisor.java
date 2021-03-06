package priv.dengjl.springaop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppAdvisor 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContextAdvisor.xml" });

    	TestService cust = (TestService) appContext.getBean("serviceProxy");

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
    }
}
