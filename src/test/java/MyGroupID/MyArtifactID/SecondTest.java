package MyGroupID.MyArtifactID;

import org.testng.annotations.Test;

public class SecondTest  {
	@Test
	public void testMethodOne(){
		System.out.println("ClassName 'SecondTest'... MethodName 'MethodOne' for Maven Project");
		System.out.println("This is imported from git repository");
		System.out.println("Added as part of Git commit after chagne");
	}
	@Test
	public void testMethodTwo(){
		System.out.println("ClassName 'SecondTest'... MethodName 'MethodTwo' for Maven Project");
		System.out.println("test git commit");
		System.out.println("Test2");
	}
	
	@Test
	public void testMethodThree(){
		System.out.println("ClassName 'SecondTest'... MethodName 'MethodThree' for Maven Project");
		System.out.println("test git commit");
		System.out.println("Test3");
	}
}
