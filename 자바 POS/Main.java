package skuniv.cs.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx1.xml");
		
		
			System.out.println("=====Product Program Start=====");
			ProductPrinter print = new ProductPrinter();
			print.run();
		
	}

}
