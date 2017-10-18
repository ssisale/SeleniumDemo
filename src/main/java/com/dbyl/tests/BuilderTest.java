package main.java.com.dbyl.tests;

import org.testng.annotations.Test;

import main.java.com.dbyl.libarary.utils.DriverFlags;
import main.java.com.dbyl.libarary.utils.Context.BrowserType;

public class BuilderTest {
	@Test(groups = { "BuilderTest" })
	public void Test1() {
		DriverFlags driver = new DriverFlags.Builder().setBrowserTyp(BrowserType.chrome).setHost("1111").build();
		System.out.println(driver.getHost() + driver.getBrowserType());

	}

}
