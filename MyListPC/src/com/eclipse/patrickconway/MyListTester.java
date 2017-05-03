package com.eclipse.patrickconway;

public class MyListTester {

	public static void main(String[] args) {
		MyList crap = new MyList();
		
		crap.add(1);
		crap.add(2.5);
		crap.add(3);
		
		double blah = crap.largest();
		
		System.out.print(blah);

	}

}
