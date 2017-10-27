package jp.co.moover.meat_project.web;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.moover.meat_project.service.MeatSearchService;

@Controller
@RequestMapping("/")
public class SearchController {
	@Autowired
	private MeatSearchService service;
	
	
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
	@RequestMapping("/keySearch")
	public void searchForJName(String keySearch, Model model) {
		model.addAttribute("MeatList", service.findByKeyWord(keySearch));
	}	
	

}
