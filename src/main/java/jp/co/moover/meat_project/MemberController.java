package jp.co.moover.meat_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.moover.meat_project.service.MemberService;

@Controller
@RequestMapping("MemberController")
public class MemberController {
	@Autowired
	private MemberService service;
	
	/**
	 * 会員のログインページへ.
	 * @return ログインページ
	 */
	@RequestMapping("/")
	public String index() {
		return "memberLogin";
	}
	
}
