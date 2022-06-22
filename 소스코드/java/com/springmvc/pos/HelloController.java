package com.springmvc.pos;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class HelloController {
	
	@Autowired
	private ProductDao productDao;
	@GetMapping(value="/repository")
		public String repository(Model model, @RequestParam(value = "id") String id, @RequestParam(value = "pwd") String pwd) { 
		if("local".equals(id) && "123456".equals(pwd)) {
			model.addAttribute("id", id);
		}
			List<Product> productList = productDao.selectAll();
			model.addAttribute("products", productList);
			return "repository";
	}
	
	@Autowired
	private MemberDao memberDao;
	@GetMapping(value="/list")
		public String list(Model model) { 

			List<Member> memberList = memberDao.selectAll();
			model.addAttribute("members", memberList);
			return "list";
	}
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		return "welcome";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@GetMapping("/login_Check")
	public String login_Check(Model model, @RequestParam(value = "id") String id, @RequestParam(value = "pwd") String pwd) {
		if("asdggw".equals(id) && "1324".equals(pwd)) {
			model.addAttribute("id", id);
		}
		if("rayrayr".equals(id) && "1234".equals(pwd)) {
			model.addAttribute("id", id);
		}
		if("local".equals(id) && "123456".equals(pwd)) {
			model.addAttribute("id", id);
		}
		
		return "login_Check";
	}
	
	@GetMapping("/managerLogin")
	public String managerLogin(Model model) {
		return "managerLogin";
	}
	
	@GetMapping("/purchasecheck")
	public String purchasecheck(Model model, @RequestParam(value="Name") String Name, @RequestParam(value="Cost") String Cost,
			@RequestParam(value="Count") String Count) {
		model.addAttribute("Name", Name);
		model.addAttribute("Cost", Cost);
		model.addAttribute("Count", Count);
		return "purchasecheck";
	}
	
	@GetMapping("/main")
	public String main(Model model) {
		return "main";
	}
	
	@PostMapping("/signup")
	public String signup(@RequestParam(value = "agree", defaultValue = "false") Boolean agree, Model model) {
		if(!agree) {
			return "agree";
		}
		model.addAttribute("registerRequest", new RegisterRequest());
		return "signup";
	}
	
	@GetMapping("signup")
	public String signupget() {
		return "redirect:/agree";
	}
	
	@Autowired
	private MemberRegisterService memberRegisterService;
	@PostMapping("/success")
	public String success(RegisterRequest regReq) {
		try {
			memberRegisterService.regist(regReq);
			return "success";
		}
		catch(Exception ex) {
			return "signup";
		}
	}
	
	@GetMapping("/success")
	public String success(Model model) {
		return "success";
	}
	
	@GetMapping("/agree")
	public String agree(Model model) {
		return "agree";
	}

	
	@GetMapping("/purchase")
	public String purchase(Model model) {
		return "purchase";
	}


}