package com.example.SpringBootDemo;

public class Greeter {
	private String format;
	
	public String greet(String guest) {
		return String.format(format,  guest);
	}
	public void setFormat(String format) {
		this.format = format;
	}
}

/*
 Property는 set/get 함수로 접근 가능한 가상의 멤버변수이다
 이름이 "format"인 property를 읽을 때는 getFormat() 함수가,
 쓸 때는 setFormat() 함수가 자동호출된다.
 즉 Greeter 클래스는 setFormat() 함수가 구현되어 있어야한다.  
 */