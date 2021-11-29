package demoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junittest {

	@Test
	public void test() {

		countA test =new countA();
			int output = test.countA("alphabet");
			assertEquals(2,output);

	}

}
