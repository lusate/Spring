package skuniv.cs.spring;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ProductPrinter {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    String name;
    String Code;
    String registerDate;
    int Count;
    int Cost; //제품 가격
	int Cnt; //손님 구입 수량
	
    List<Member> members = new ArrayList<>();
    public void run() {
	while (true) {
        int input = -1;
        System.out.println("----------------------");
        System.out.println("Product Program");
        System.out.println("----------------------");
        System.out.println("1. Sign up");
        System.out.println("2. Login");
        System.out.println("3. Purchase Product");
        System.out.println("4. Inventory Management");
        System.out.println("5. statistical Function");
        System.out.println("0. Quit");
        System.out.println("Input : ");

        try {
            input = Integer.valueOf(br.readLine());
        }
        catch (Exception e) {
            System.out.println("ERROR!!");
            continue;
        }

            switch(input) {
                case 1:
                    SignUp();
                    break;
                case 2 :
                	Login();
                    break;
                case 3 : 
                	purchaseProduct();
                	break;
                case 4 :
                	manageProduct();
                	break;
                case 5 :
                    statisticsProduct();
                    break;
                case 0 :
                    System.out.println("Quit");
                    return;
                default:
                    System.out.println("ERROR: Invalid Input");
            }
        }
	}
    
	public void SignUp() { //case1
    	System.out.println("회원가입 하기");
        String id = getStrInput("ID : ");
        String pw = getStrInput("PassWord : ");
        String pw2 = getStrInput("Password Confirm : ");
        String name = getStrInput("Name : ");
        
        if(idCheck(id)) {
            System.out.println("중복된 ID입니다.");
        }
        else if(pw.equals(pw2)) {
            members.add(new Member(id, pw));
            System.out.println(id + "님 가입을 축하드립니다.");
        }
        else {
            System.out.println("비밀번호를 확인해주세요.");
        }
        
    }
	
	public boolean idCheck(String id) {
        boolean check = true;
        Member member = FindById(id);
        if(member == null)
            check = false;
        return check;
    }
    
    public String getStrInput(String msg) {
        System.out.println(msg);
        return sc.nextLine();        
    }
    
    public boolean Login() { //case2
    	System.out.println("로그인하기");
        String id = getStrInput("ID : ");
        String pw = getStrInput("PassWord : " );
        
        Member member = FindById(id);
        
        if(member == null){
            System.out.println("등록되지 않은 ID입니다.");
            System.out.println("회원가입 하시려면 1번 다시 로그인 하시려면 2번을 입력하세요. 처음으로 돌아가시려면 0번을 입력해주세요.");
            while(true) {
	            int input = -1;
	            try {
	                input = Integer.valueOf(br.readLine());
	            }
	            catch (Exception e) {
	                System.out.println("ERROR!!");
	                continue;
	            }
	            switch(input) {
	            case 1:
	                SignUp();
	                break;
	            case 2 :
	            	Login();
	                break;
	            case 0 :
	                System.out.println("Quit");
	                return false;
	            default:
	                System.out.println("ERROR: Invalid Input");
	            }
            }
        }
        else if(member.getPassword().equals(pw)) {
            System.out.println("[" + member.getID() + "]님께서 로그인 하셨습니다.");
        }
        else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
        
        return false;
        
    }
    
    public Member FindById(String id) {
        for(Member member : members) {
            if(member.getID().equals(id)) {
                return member;
            }
        }
        return null;
    }

    public void purchaseProduct() {
    	while(true) {
    	if(!Login()) {
    		System.out.println("제품 구매하기.");
    	    System.out.println("Name: ");
    	    name = sc.next();
    	    System.out.println("Cost: ");
    	    Cost = sc.nextInt();
    	    System.out.println("Cnt: ");
    	    Cnt = sc.nextInt();
    	    System.out.println("Calculate: " + Cost * Cnt);
    	}
    	else{
    		System.out.println("로그인을 하세요");
    	}
    	}
    }

    
    public void manageProduct() {
    	int num = -1;
    	System.out.println("재고 관리");
    	System.out.println("1. 제품 추가  2. 제품 삭제  3. 제품 전체 목록");
    	while(true) {
    	try {
            num = Integer.valueOf(br.readLine());
        }
        catch (Exception e) {
            System.out.println("ERROR!!");
            continue;
        }
    	switch(num) {
        case 1:
            add();
            break;
        case 2 :
        	remove();
            break;
        case 3 :
        	List();
        	break;
        case 0 :
            System.out.println("Quit");
            return;
        default:
            System.out.println("ERROR: Invalid Input");
    	}
    	}
    }
    
    public void add() {
    	System.out.println("제품 추가");
    	
		String Code = conInput("제품 코드");
		int Cost = conInput2("가격");
		String registerDate = conInput("날짜");
		int Count = conInput2("개수");
		
		ProductRepository.productList.put(Code, new Product(Code, Cost, registerDate, Count));
		
		System.out.println("추가 되었습니다");
    }
    
  //콘솔에서 문자입력받아 리턴하는 메소드
  	public String conInput(String msg) {
  		System.out.print(msg + "=" + "\n");
  		return sc.next();
  	}
  	
  	public int conInput2(String msg) {
  		System.out.print(msg + "=" + "\n");
  		return sc.nextInt();
  	}

  	
  //사원삭제
  	public void remove() {
  		String Code = conInput("삭제할 제품 코드");
  		ProductRepository.productList.remove(Code);
  	}
  	
  	public void List() {
  		ProductRepository.setProductList();
		Set<String> keyList = ProductRepository.productList.keySet();
		Iterator<String> ii = keyList.iterator();
		while(ii.hasNext()) {
			Product vo = ProductRepository.productList.get(ii.next());
			System.out.printf("%s\t%d\t%s\t%d\n", vo.getCode(), vo.getCost(), vo.getregisterDate(), vo.getCount());
		}
	}
    
    public void statisticsProduct() {
    	System.out.println("통계 확인\t");
    	System.out.print("제품 코드\t\t");
    	System.out.print("하루 매출량\t");
    	System.out.print("일주일 매출량\t");
    	System.out.print("한달 매출량\t");
    	System.out.println("매출액");
    	
    	SalesRepository.setsaleList();
    	Set<String> SaleList = SalesRepository.saleList.keySet();
		Iterator<String> li = SaleList.iterator();
		while(li.hasNext()) {
			Sales vo = SalesRepository.saleList.get(li.next());
			System.out.printf("%s\t%d\t\t%d\t\t%d\t\t%d\n", vo.getCode(), vo.getDay(), vo.getWeek(), vo.getMonth(), vo.getSales());
		}
		String best = "ItemCode1";
		System.out.println("최다 판매제품 : " + best);
    }
		
	
}
