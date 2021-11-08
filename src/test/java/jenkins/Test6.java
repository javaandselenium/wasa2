package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test6 {
	@Test
	public void tc1() {
		Reporter.log("hello API",true);
	}

}
