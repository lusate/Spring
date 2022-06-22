package com.example.SpringBootDemo;
import org.springframework.context.support.GenericXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:applicationContext.xml");
		Greeter g = (Greeter)ctx.getBean("greeter");
		String msg = g.greet("Spring");
		System.out.println(msg);
		ctx.close();
	}
}

// Java 클래스 이름없이 Java 객체를 생성하였음
// Spring(ctx) 이 applicationContext.xml 에 등록된 "greeter" 이름을 가지고
// com.example.demoGreeter 객체를 생성함. 또한 <property> 태그에 지정된 value 값을
// "name" property에 지정함