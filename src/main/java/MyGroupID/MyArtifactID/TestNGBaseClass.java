package MyGroupID.MyArtifactID;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestNGBaseClass {
	
	@BeforeClass
	public void method1(){
		System.out.println("Hi One");
	}
	@AfterClass
	public void method2(){
		System.out.println("Hi Two");
	}
	@BeforeTest
	public void method3(){
		System.out.println("Hi Three");
	}
	@AfterTest
	public void method4(){
		System.out.println("Hi Four");
	}

}
