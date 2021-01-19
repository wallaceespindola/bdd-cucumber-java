package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RestaurantSystemHooks {
	@Before("@SmokeTest")
	public void BeforeDisplayMessage(Scenario sc) {
		System.out.println("Before " + sc.getName());
	}

	@After("@SmokeTest")
	public void AfterDisplayMessage(Scenario sc) {
		System.out.println("After " + sc.getName());
	}
}
