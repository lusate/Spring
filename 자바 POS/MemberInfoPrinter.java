package skuniv.cs.spring;


import org.springframework.beans.factory.annotation.Autowired;



public class MemberInfoPrinter {

	@Autowired
	private MemberDao memDao;
	private ProductPrinter printer;

	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}

	@Autowired
	public void setPrinter(ProductPrinter printer) {
		System.out.println("setPrinter: " + printer);
		this.printer = printer;
	}
	
	public void printMemberInfo(String ID) {
		Member member = memDao.selectByID(ID);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.Login();
		System.out.println();
	}
}
