package com.hexa;

public class Adactin {
	public static void main(String[] args) throws Exception {
		String excelFile = "D:\\workspace\\FrameWork\\Excel data\\adactin.xlsx";
		String sheetName = "Sheet1";
		Base1 base = new Base1();
		LoginPojo loginPojo = new LoginPojo();

		base.launchUrl("https://adactinhotelapp.com/");
		base.sendInput(loginPojo.getTxtUser(), base.getDataFromExcel(excelFile, sheetName, 1, 0));
		base.sendInput(loginPojo.getTxtpass(), base.getDataFromExcel(excelFile, sheetName, 1, 1));
		base.clickElement(loginPojo.getLoginbtn());
		base.selectFromDropdown(loginPojo.getLocation(), "Sydney");
		base.selectFromDropdown(loginPojo.getHotels(), "Hotel Sunshine");
		base.selectFromDropdown(loginPojo.getRoomtype(), "Standard");
		base.clickElement(loginPojo.getSearch());
		base.clickElement(loginPojo.getRadiobtn());
		base.clickElement(loginPojo.getContinuebtn());

		base.sendInput(loginPojo.getFirstName(), "iyswarya");
		base.sendInput(loginPojo.getLastName(), "m");
		base.sendInput(loginPojo.getAddress(), "chennai");
		base.sendInput(loginPojo.getCcNum(), "1234567891234567");
		base.selectFromDropdown(loginPojo.getCctype(), "AMEX");
		base.selectFromDropdown(loginPojo.getExpiryMonth(), "5");
		base.selectFromDropdown(loginPojo.getExpiryYear(), "2022");
		base.sendInput(loginPojo.getCvvValue(), "012");
		base.clickElement(loginPojo.getBookNow());
		Thread.sleep(5000);
		String orderNumber = base.getText(loginPojo.getOrderNumber());
		System.out.println("Your order number is " + orderNumber);
	}

}
