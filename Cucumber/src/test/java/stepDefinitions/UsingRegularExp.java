package stepDefinitions;

import io.cucumber.java.en.Given;

public class UsingRegularExp {


	@Given("^I have (\\d+) laptop$")
	public void i_have_laptop(int count) {
	 System.out.println("Laptop Count "+count);
		
	 	}
	

	@Given("^I have (\\d+\\.\\d+) CGPA$")
	public void i_have_cgpa(float cgpa) {
	 System.out.println("CGPA is "+cgpa);   
	}
	
	@Given("\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String name, String name1, String name2) {
		System.out.println(name +" is elder to "+name1+" and "+name2);
	}


}
