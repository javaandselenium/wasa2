package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void tc1() {
		Reporter.log("hello Python",true);
	}

}
