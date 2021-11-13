package com.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Base1 {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement txtUser;
	@FindBy(id = "password")
	private WebElement txtpass;
	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement ccNum;
	@FindBy(id = "login")
	private WebElement loginbtn;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "Submit")
	private WebElement search;
	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;
	@FindBy(id = "continue")
	private WebElement continuebtn;
	@FindBy(id = "cc_type")
	private WebElement cctype;
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvValue;
	@FindBy(id = "book_now")
	private WebElement bookNow;
	@FindBy(id = "order_no")
	private WebElement orderNumber;

	public WebElement getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(WebElement orderNumber) {
		this.orderNumber = orderNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void setBookNow(WebElement bookNow) {
		this.bookNow = bookNow;
	}

	public WebElement getCvvValue() {
		return cvvValue;
	}

	public void setCvvValue(WebElement cvvValue) {
		this.cvvValue = cvvValue;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(WebElement expiryYear) {
		this.expiryYear = expiryYear;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public void setCctype(WebElement cctype) {
		this.cctype = cctype;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

}
