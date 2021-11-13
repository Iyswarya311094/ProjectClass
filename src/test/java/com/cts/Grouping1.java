package com.cts;

import org.testng.annotations.Test;

public class Grouping1 {
	@Test(groups = { "Reg", "sanity" })
	private void test1() {

	}

	@Test(groups = "sanity")
	private void test2() {

	}

}
