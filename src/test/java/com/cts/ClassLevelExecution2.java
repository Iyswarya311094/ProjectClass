package com.cts;

import org.testng.annotations.Test;

public class ClassLevelExecution2 {
	@Test
	private void test11() {
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void test12() {
		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void test13() {
		System.out.println(Thread.currentThread().getId());

	}
}
