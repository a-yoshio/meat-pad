package jp.co.moover.meat_project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.moover.meat_project.domain.Member;

/**
 * 会員情報をDBからやりとりする.
 * @author chai
 *
 */
@Repository
@Transactional
public class MemberRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public static final RowMapper<Member> memberRowMapper =(rs,i)->{
		Member member = new Member();
		member.setId(rs.getInt("id"));
		member.setName(rs.getString("name"));
		member.setZipCode(rs.getString("zip_code"));
		member.setAddress(rs.getString("address"));
		member.setPhoneNumber("phone_number");
		member.seteMail("e_mail");
		return member;
	};
	
	/**
	 * 会員データ保存用.
	 * @param member 会員データ
	 */
	public void save(Member member) {
		String sql ="insert into member (name, zip_code, address, phoneNumber, eMail)"
				+ " values(:name, :zipCode, :address, :phoneNumber, :eMail);";
		SqlParameterSource param = new BeanPropertySqlParameterSource(member);
		template.update(sql, param);
	}
	
	/**
	 * 会員データ取得用.
	 * @param id 取得したい会員のID
	 * @return 取得した会員データ
	 */
	public Member load(Integer id) {
		String sql ="select id, name, zip_code, address, phone_number, e_mail"
				+ " from member where :id;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		Member member= template.queryForObject(sql, param, memberRowMapper);
		return member;
	}

}
