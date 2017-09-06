package jp.co.moover.meat_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.moover.meat_project.domain.Meat;
import jp.co.moover.meat_project.repository.MeatRepository;

/**
 * お肉の検索を行うためのサービス.
 * @author chai
 *
 */
@Service
public class MeatSearchService {
	@Autowired
	private MeatRepository repository;
	
	/**
	 * 記入されたキーワードで曖昧検索を行う.
	 * @param keyWord 曖昧検索キーワード
	 * @return　取得したデータ
	 */
	public List<Meat> findByKeyWord(String keyWord) {
		return repository.findByKeyWord(keyWord);
	}

	

}
