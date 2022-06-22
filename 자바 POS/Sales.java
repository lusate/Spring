package skuniv.cs.spring;

//판매량
public class Sales {
	//하루 , 일주일 , 한달 , 매출액 , 최다
	private String Code;
	private int day;
	private int week;
	private int month;
	private int sales;
	
	public Sales(String Code, int day, int week, int month, int sales) {
		this.Code = Code;
		this.day = day;
		this.week = week;
		this.month = month;
		this.sales = sales;
	}
	
	public String getCode() {
		return Code;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getWeek() {
		return week;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getSales() {
		return sales;
	}

	public void setDay(int day) {
        this.day = day;
    }
 
	public void setWeek(int week) {
        this.week = week;
    }
 
	public void setMonth(int month) {
        this.month = month;
    }
    
	public void setSales(int sales) {
        this.sales = sales;
    }
	
	
	public void setCode(String Code) {
        this.Code = Code;
    }
}
