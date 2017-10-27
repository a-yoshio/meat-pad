package jp.co.moover.meat_project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.moover.meat_project.domain.Meat;
import jp.co.moover.meat_project.repository.MeatRepository;

/**
 * お肉の検索を行うためのサービス.
 * @author atsuko.yoshino
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
		String keyList[]= keyWord.split(" ");
		List<Meat> getMeatList= new ArrayList<>();
		for(String key: keyList) {
			List<Meat> meatList= repository.findByKeyWord(key);
			for(Meat meat:meatList) {
				if(!(getMeatList.contains(meat))) {
					getMeatList.add(meat);
				}
			}
		}
		return getMeatList;
	}

	

}
