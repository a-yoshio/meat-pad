package jp.co.moover.meat_project.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.moover.meat_project.domain.Meat;

/**
 * お肉データの取得、保存.
 * @author chai
 *
 */
@Repository
@Transactional
public class MeatRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public static final RowMapper<Meat> meatRowMapper =(rs,i) ->{
		Meat meat = new Meat();
		meat.setId(rs.getInt("id"));
		meat.setE_name(rs.getString("e_name"));
		meat.setJ_name(rs.getString("j_name"));
		meat.setPart_id(rs.getInt("part_id"));
		meat.setHard_lev(rs.getInt("hard_lev"));
		meat.setPoint(rs.getInt("point"));
		meat.setPicture(rs.getString("picture"));
		meat.setDescription(rs.getString("description"));
		return meat;
	};
	
	/**
	 * MeatRepository内で使用するメソッド.
	 * 畜種を詰め込んだリストの使用ができる
	 * @return　畜種リスト
	 */
	public List<String> getLiveStockList(){
		List<String> liveStockList = new ArrayList<>();
		liveStockList.add(0, "beef");
		liveStockList.add(1, "pork");
		liveStockList.add(2, "chekin");
		return liveStockList;
	}
	
	/**
	 * 日本名でお肉をあいまい検索してデータを取得する.
	 * @param keyWord 曖昧検索ワード
	 * @return　取得したデータ
	 */
	public List<Meat> findByKeyWord(String keyWord) {
		List<Meat> meatList = new ArrayList<>();
		for( String liveStock: getLiveStockList()) {
		String sql ="select id, e_name, j_name, part_id, hard_lev, point, picture, description "
				+ "from "+liveStock+" where e_name like ':j_name' order by j_name;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("j_name","%"+keyWord+"%");
		meatList = template.query(sql, param, meatRowMapper);
		}
		return meatList;
	}
	

}
