package Testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic 
{
	@Parameters({"url"})
	@Test
	public void test(String output)
	{
		System.out.println("hello");
		System.out.println(output);
		
	}
	@Test(dataProvider= "getdata")
	public void test1(String Username, String Pass)
	{
		System.out.println("mangesh");
		System.out.println(Username);
		System.out.println(Pass);
		
	}
	@Test(groups= {"Smoke"})
	public void test2()
	{
		System.out.println("vikharankar");
		
	}
	
	@Test
	public void test3()
	{
		System.out.println("OnTestFailure");
		Assert.assertTrue(false);
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data= new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstpass";
		data[1][0] = "secondusername";
		data[1][1] = "secondpass";
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpass";
		return data;
	}
	


}
