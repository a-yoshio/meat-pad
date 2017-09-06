package jp.co.moover.meat_project.domain;

/**
 * お肉のデータを受け取る.
 * @author chai
 *
 */
public class Meat {
	/**ID*/
	private int id;
	/**名前*/
	private String e_name;
	/**日本名*/
	private String j_name;
	/**部位ID*/
	private int part_id;
	/**硬さレベル*/
	private int hard_lev;
	/**人気ポイント*/
	private int point;
	/**写真*/
	private String picture;
	/**説明*/
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getJ_name() {
		return j_name;
	}
	public void setJ_name(String j_name) {
		this.j_name = j_name;
	}
	public int getPart_id() {
		return part_id;
	}
	public void setPart_id(int part_id) {
		this.part_id = part_id;
	}
	public int getHard_lev() {
		return hard_lev;
	}
	public void setHard_lev(int hard_lev) {
		this.hard_lev = hard_lev;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
