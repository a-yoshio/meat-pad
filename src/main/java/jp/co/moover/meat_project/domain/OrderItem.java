package jp.co.moover.meat_project.domain;

/**
 * 注文商品.
 * @author chai
 *
 */
public class OrderItem {
	
	/**注文商品ID*/
	private Integer id;
	/**お客様ID*/
	private Integer memberId;
	/**注文商品カテゴリーID*/
	private Integer categoryId;
	/**注文商品ID*/
	private Integer itemId;
	/**注文グラム数*/
	private Integer gram;
	/**合計金額*/
	private Integer totalprice;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getGram() {
		return gram;
	}
	public void setGram(Integer gram) {
		this.gram = gram;
	}
	public Integer getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Integer totalprice) {
		this.totalprice = totalprice;
	}
	
	
}
