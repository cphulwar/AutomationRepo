package com.cp.autotest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asertion1 {

	@Test
	public void a() {
		int i = 30;
		int j = 30;

		Assert.assertTrue(i >= j);
	}
}
