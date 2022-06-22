package com.springmvc.pos;

import java.time.LocalDateTime;

public class Product {
	//제품별 코드, 가격 지정, 날짜별 제품 입고, 수량
	private Long Code;
	private int Cost; //제품 가격
	private String Name;
	private LocalDateTime registerDate;
	private int Count; //입고 수량
	private int sum;
	
	public Product(String Name, int Cost, int Count, LocalDateTime registerDate) {
		this.Name = Name;
		this.Cost = Cost;
		this.Count = Count;
		this.registerDate = registerDate;
	}

	public Long getCode() {
		return Code;
	}
	
	public int getCost() {
		return Cost;
	}
	
	public String getName() {
		return Name;
	}
	
	public LocalDateTime getregisterDate() {
		return registerDate;
	}
	
	public int getCount() {
		return Count;
	}

	public void setCode(Long Code) {
        this.Code = Code;
    }
 
	public void setName(String Name) {
		this.Name = Name;
	}
	
    public void setCost(int Cost) {
    	this.Cost = Cost;
    }
 
    public void setDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }
    
    public void setCount(int Count) {
        this.Count = Count;
    }

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

    
}