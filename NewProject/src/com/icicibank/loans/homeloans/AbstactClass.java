package com.icicibank.loans.homeloans;
/*Abstract class contains concreate and abstract methods 
 * and here  we can't create object(instance) for this class
 * it is extends by the child class and here need to give keyword abstract for unimplemented
   methods    */

public abstract class AbstactClass {
	
	int abstract_sal = 30000;
	
	public abstract void absMethod();
	
	public void concMethod()
	{
		System.out.println("We are creating concrete method by using abstract class.");
	}
 
	
}
