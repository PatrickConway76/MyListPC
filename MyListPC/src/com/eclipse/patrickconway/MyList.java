package com.eclipse.patrickconway;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyList <T extends Number> 
{
	private ArrayList<T> list = new ArrayList<>();
	
	public void add(T number)
	{
		list.add(number);
	}
	
	public double largest()
	{
		double largest = Double.MIN_VALUE;
		
		for (int i = 0; i < list.size(); i++)
		{
			double temp = list.get(i).doubleValue();
			
			if (temp > largest)
			{
				largest = temp;
			}
		}
				
		return largest;
	}
	
	public double smallest()
	{
		double smallest = Double.MAX_VALUE;
		
		for (int i = 0; i < list.size(); i++)
		{
			double temp = list.get(i).doubleValue();
			
			if (temp < smallest)
			{
				smallest = temp;
			}
		}
				
		return smallest;
	}

}
