package com.eclipse.patrickconway;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Takes a generic list and gives the smallest and largest values
 * @author Patrick
 *
 * @param <T> The type of the item being added to the list
 */
public class MyList <T extends Number> 
{
	private ArrayList<T> list = new ArrayList<>();
	
	/**
	 * Adds a number to the list
	 * @param number The number to add
	 */
	public void add(T number)
	{
		list.add(number);
	}
	
	/**
	 * Finds the largest number in the list
	 * @return The largest number
	 */
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
	
	/**
	 * Finds the smallest number in the list
	 * @return The smallest number
	 */
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
	
	/**
	 * Displays the list
	 * @return The list in string form
	 */
	public String displayList()
	{
		return list.toString();
	}

}
