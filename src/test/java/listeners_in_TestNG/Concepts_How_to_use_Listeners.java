package listeners_in_TestNG;

public class Concepts_How_to_use_Listeners {
	
	//Create a Class which implements ITestListener. Import all the unimplemented methods of this interface
	//Connect the Test Case with the Listeners class by: -
	
	//1. On top of the class give the annotation @Listeners({ClassContainingListener.class})
	
	//But point no 1 is cumbersome as in each Test Case we have to keep defining the same step.
	
	//so better implement this in testng.xml file
	//under the <suite> tag
	/*
	 
	<listeners>
	     <listener class-name = "listeners_in_TestNG.MyListeners" />
    </listeners>
     
     */

}
