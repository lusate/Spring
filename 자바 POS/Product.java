package skuniv.cs.spring;


public class Product {
	//제품별 코드, 가격 지정, 날짜별 제품 입고, 수량
	private String Code;
	private int Cost; //제품 가격
	private String registerDate;
	private int Count; //입고 수량

	public Product(String Code, int Cost, String registerDate, int Count) {
		this.Code = Code;
		this.Cost = Cost;
		this.registerDate = registerDate;
		this.Count = Count;
	}
	
	public String getCode() {
		return Code;
	}
	
	public int getCost() {
		return Cost;
	}
	
	public String getregisterDate() {
		return registerDate;
	}
	
	public int getCount() {
		return Count;
	}

	public void setCode(String Code) {
        this.Code = Code;
    }
 
    public void setCost(int Cost) {
    	this.Cost = Cost;
    }
 
    public void setDate(String registerDate) {
        this.registerDate = registerDate;
    }
    
    public void setCount(int Count) {
        this.Count = Count;
    }
}