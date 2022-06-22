package skuniv.cs.spring;

public class Member {
	 private String ID;
	 private String password;
	 private String name;
	    
	    public Member(String ID, String password) {
	    	super();
	        this.ID = ID;
	        this.password = password;
	    }
	 
	    public String getID() {
	        return ID;
	    }
	 
	    public String getPassword() {
	        return password;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setID(String ID) {
	        this.ID = ID;
	    }
	 
	    public void setPassword(String password) {
	    	this.password = password;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    @Override
	    public String toString() {
	        return "ID : " + ID + " PW : " + password + " Name : " + name;
	    }

}
