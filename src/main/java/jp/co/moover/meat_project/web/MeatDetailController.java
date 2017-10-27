package jp.co.moover.meat_project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 肉詳細ページコントローラー.
 * @author atsuko.yoshino
 *
 */
@Controller
@RequestMapping("/detail")
public class MeatDetailController {
	
	/**
	 * 食肉詳細ページを開く.
	 * @return 詳細ページ
	 */
	@RequestMapping("/")
	public String index() {
		return "detail";
	}
}
