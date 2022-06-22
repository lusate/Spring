package skuniv.cs.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class MemberDao {

	private Map<String, Member> map = new HashMap<>();
	
	public Member selectByID(String ID) {
		return map.get(ID);
	}
		
	public Collection<Member> selectAll() {
		return map.values();
	}

}
