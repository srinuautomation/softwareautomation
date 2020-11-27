package MyGroupID.MyArtifactID;

import org.testng.annotations.Test;

public class TestOneWithMVN {
	@Test
	public void testMethodOne(){
		System.out.println("ClassName 'TestOneWithMVN'... MethodName 'MethodOne' for Maven Project");
		System.out.println("THis comment made from branch 'develop'");
	}
	
	@Test
	public void testMethodTwo(){
		System.out.println("ClassName 'TestOneWithMVN'... MethodName 'tesMethodTwo' for Maven Project");
		System.out.println("THis comment made from branch 'develop'");
		
	}
	@Test
	public void testMethodThree(){
		System.out.println("ClassName 'TestOneWithMVN'... MethodName 'tesMethodThree' for Maven Project");
		System.out.println("THis comment made from branch 'develop'");
		
	}
}
