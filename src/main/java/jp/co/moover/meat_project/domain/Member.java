package jp.co.moover.meat_project.domain;

import java.util.List;

/**
 * 会員データ.
 * @author chai
 *
 */
public class Member {
	
	/**ID*/
	private Integer id;
	/**名前*/
	private String name;
	/**郵便番号*/
	private String zipCode;
	/**住所*/
	private String address;
	/**電話番号*/
	private String phoneNumber;
	/**メールアドレス*/
	private String eMail;
	/**注文商品リスト*/
	private List<OrderItem> orderItemList; 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	

}
