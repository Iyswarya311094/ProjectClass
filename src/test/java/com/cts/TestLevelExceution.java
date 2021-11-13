package com.cts;

import org.testng.annotations.Test;

public class TestLevelExceution {
	@Test
	private void test1() {
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void test2() {
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void test3() {
		System.out.println(Thread.currentThread().getId());

	}
}
