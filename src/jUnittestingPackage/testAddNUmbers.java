package jUnittestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNUmbers {

	@Test
	public void test() {
		jUnitFunction jUnit=new jUnitFunction();
		int result=jUnit.addNumbers(100,12);
		assertEquals(112,result);
	}

}
