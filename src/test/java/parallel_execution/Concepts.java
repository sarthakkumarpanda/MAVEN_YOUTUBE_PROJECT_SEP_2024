package parallel_execution;

public class Concepts {
	
	//in the @DataProvider annotation, give parallel=true but this concept most of the time fails. 
	//then go to testng.xml and at <suite> level give data-provider-thread-count = "2"
	
	// in testng.xml at <suite> level parallel="tests" thread-count="3"
	// in testng.xml at <suite> level or <test> level parallel="classes" thread-count="3"
	// in testng.xml at <suite> level parallel="tests" thread-count="3"
	// in testng.xml at <suite> level parallel="methods" thread-count="5"
	

}
