package com.eclipse.patrickconway;

public class MyListTester {

	public static void main(String[] args)
	{
		MyList<Number> aList = new MyList<Number>();
		byte aByte = 7;
		short aShort = 1024;
		int anInt = 256;
		long aLong = 2345623;
		float aFloat = 234.2355f;
		double aDouble = 6234.34234433;
		
		aList.add(aByte);
		aList.add(aShort);
		aList.add(anInt);
		aList.add(aLong);
		aList.add(aFloat);
		aList.add(aDouble);
		
		System.out.println("This is the current list: " + aList.displayList());
		System.out.println("The largest number is: " + aList.largest());
		System.out.println("The smallest number is: " + aList.smallest());

	}

}
