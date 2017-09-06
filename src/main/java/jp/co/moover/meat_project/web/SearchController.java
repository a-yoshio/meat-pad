package jp.co.moover.meat_project.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.moover.meat_project.form.MeatJNameSearchForm;
import jp.co.moover.meat_project.service.MeatSearchService;

@Controller
@RequestMapping("/meatSearch")
public class SearchController {
	@Autowired
	private MeatSearchService service;
	
	/*@ModelAttribute
	public final MeatJNameSearchForm setUp() {
		
		return new MeatJNameSearchForm();
	}
	*/
	
	/**
	 * トップ画面の表示.
	 * @return トップ画面
	 */
	@RequestMapping("/")
	public String index() {
		
		return "top";
	}
	
	/**
	 *　日本名での曖昧検索.
	 * @param form 曖昧検索キーワード格納クラス
	 * @param model　モデル
	 */
	public void searchForJName(MeatJNameSearchForm form, Model model) {
		model.addAttribute("MeatList", service.findByKeyWord(form.getjName()));
	}	
	

}
