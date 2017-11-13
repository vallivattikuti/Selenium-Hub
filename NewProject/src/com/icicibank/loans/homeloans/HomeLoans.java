package com.icicibank.loans.homeloans;

public class HomeLoans extends AbstactClass implements HomePackage {
	
	int sal=40000;
	public void totalSal()
	{
		System.out.println("The employer total salary");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeLoans obj = new HomeLoans();
		HomeLoans obj1 = new HomeLoans();
		obj.totalSal();
		System.out.println(obj.sal);
		
		obj1.totalSal();
		System.out.println(obj1.sal);
		obj1.sal();
		obj1.absMethod();
		obj1.concMethod();
		
	}

	@Override
	public void sal() {
		// TODO Auto-generated method stub
		System.out.println("This is implemnts from HomePackage Interface.");
		
	}

	@Override
	public void absMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is extends from AbstactClass.");
		
	}


	

}