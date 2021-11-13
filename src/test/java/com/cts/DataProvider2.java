package com.cts;

import org.testng.annotations.Test;

public class DataProvider2 {
	@Test(dataProvider = "res", dataProviderClass = SampleDataProvider.class)
	private void test2(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);

	}
}
