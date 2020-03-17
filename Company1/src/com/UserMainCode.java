package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Hike
{
	public HashMap<Integer, Integer> increaseSalaries(HashMap<Integer, String> hm1, HashMap<Integer, Integer> hm2)
	{
		Set keys = hm1.keySet();
		HashMap<Integer, Integer> res = new HashMap();
		Iterator itr = keys.iterator();
		while (itr.hasNext()) 
		{
			int id = (int) itr.next();
			String s = hm1.get(id);
			if (s.equals("manager")) 
			{
				int newsal = hm2.get(id) + 5000;
				res.put(id, newsal);
			}

		}
		return res;
	}
}

public class UserMainCode 
{
                                                                                                         
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Hike h = new Hike();                                                                                                                                
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of employees");
		int n = sc.nextInt();
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter id:");
			int id = sc.nextInt();
			System.out.println("Enter designation");
			String desig = sc.next();
			System.out.println("Enter Salary:");
			int salary = sc.nextInt();
			hm1.put(id, desig);
			hm2.put(id, salary);
		}

		HashMap<Integer, Integer> r = new HashMap<Integer, Integer>();
		r = h.increaseSalaries(hm1, hm2);

		System.out.println("result :" + r);
	}
}
