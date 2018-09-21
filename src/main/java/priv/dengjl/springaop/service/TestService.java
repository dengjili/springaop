package priv.dengjl.springaop.service;

/**
 * 业务类
 * 
 * @author it
 */
public class TestService {
	private String name;
	private String url;

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void printName() {
		System.out.println("名称 : " + this.name);
	}

	public void printURL() {
		System.out.println("网址 : " + this.url);
	}

	public void printThrowException() {
		throw new IllegalArgumentException("1234");
	}
	public String returnValue() {
		return "abc";
	}
	
	public void testAroud() {
		System.out.println("11111111111144444444444");
	}
}
