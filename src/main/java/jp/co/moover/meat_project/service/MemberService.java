package jp.co.moover.meat_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.moover.meat_project.domain.Member;
import jp.co.moover.meat_project.repository.MemberRepository;

/**
 * 会員データをDBとやりとりする.
 * @author chai
 *
 */
@Service
public class MemberService {
	@Autowired
	private MemberRepository repository;
	
	/**
	 * 会員データ保存用.
	 * @param member 会員データ
	 */
	public void save(Member member) {
		repository.save(member);
	}
	
	/**
	 * 会員データ取得用.
	 * @param id 取得したい会員のID
	 * @return 取得した会員データ
	 */
	public Member load(Integer id) {
		return repository.load(id);
	}
	

}
