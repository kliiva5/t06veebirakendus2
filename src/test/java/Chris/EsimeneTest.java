package Chris;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	@Test
	public void BankTest1(){
		
		Rakendus r = new Rakendus();
		
		String account_nr = "EE909900123456789012";
		
		//Tests to see if any data was entered
		assertEquals("Missing data", r.BankAccount(null));
		assertEquals("No data was entered", r.BankAccount(""));
		
		//Test to see if the bank account is 20 characters long
		assertEquals("The bank account must be 20 characters long", r.BankAccount(account_nr));
		
	}
	
	@Test
	public void BankTest2(){
		
		Rakendus r = new Rakendus();
		
		//Test to see if the bank account contains it's nation code
		assertEquals("The bank account must contain it's nation code(EE)", r.BankAccountNCode("909900123456789012"));
		
	}
	
}