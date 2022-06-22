package com.springmvc.pos;

import java.time.LocalDateTime;

public class ProductRegist {
	private String Name;
	private int Cost;
	private int Count;
	private LocalDateTime registerDate;

	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

	public LocalDateTime getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}
}
