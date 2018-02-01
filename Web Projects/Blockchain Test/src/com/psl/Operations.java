package com.psl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Operations {

	public boolean isOdd(int number) {
		return number % 2 == 1;
	}

	public boolean isEven(int number) {
		return number % 2 == 0;
	}

	public int sumOfList(List<Integer> list) {
		int returnSum = 0;
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			returnSum += (Integer) iterator.next();
		}
		return returnSum;
	}

	public int sumOfList(Integer... args) {
		int returnSum = 0;
		for (int i = 0; i < args.length; i++) {
			returnSum += args[i];
		}
		return returnSum;
	}

	public int productOfList(List<Integer> list) {
		int returnProduct = 1;
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			returnProduct *= (Integer) iterator.next();
		}
		return returnProduct;
	}

	public int productOfList(Integer... args) {
		int returnProduct = 1;
		for (int i = 0; i < args.length; i++) {
			returnProduct *= args[i];
		}
		return returnProduct;
	}

	public ArrayList<Integer> oddNumbers(List<Integer> list) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer i = (Integer) iterator.next();
			if (isOdd(i))
				returnList.add(i);
		}
		return returnList;
	}

	public ArrayList<Integer> oddNumbers(Integer... args) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for (int i = 0; i < args.length; i++) {
			if (isOdd(args[i]))
				returnList.add(args[i]);
		}
		return returnList;
	}

	public ArrayList<Integer> evenNumbers(List<Integer> list) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer i = (Integer) iterator.next();
			if (isEven(i))
				returnList.add(i);
		}
		return returnList;
	}

	public ArrayList<Integer> evenNumbers(Integer... args) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for (int i = 0; i < args.length; i++) {
			if (isEven(args[i]))
				returnList.add(args[i]);
		}
		return returnList;
	}

	public ArrayList<Integer> divisibleBy(List<Integer> list, int divisor) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (Iterator<Integer> iterator = list.iterator(); iterator
					.hasNext();) {
				Integer i = (Integer) iterator.next();
				if (i > 0 && i % divisor == 0)
					returnList.add(i);
			}
		else return null;
		return returnList;
	}

	public ArrayList<Integer> divisibleBy(int divisor, Integer... args) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (int i = 0; i < args.length; i++) {
				if (args[i] > 0 && args[i] % divisor == 0)
					returnList.add(args[i]);
			}
		return returnList;
	}

	public ArrayList<Integer> multiplesOf(List<Integer> list, int divisor) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (Iterator<Integer> iterator = list.iterator(); iterator
					.hasNext();) {
				Integer i = (Integer) iterator.next();
				if (i > 0 && i % divisor == 0)
					returnList.add(i);
			}
		return returnList;
	}

	public ArrayList<Integer> multiplesOf(int divisor, Integer... args) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (int i = 0; i < args.length; i++) {
				if (args[i] > 0 && args[i] % divisor == 0)
					returnList.add(args[i]);
			}
		return returnList;
	}

	public ArrayList<Integer> oddAndDivisibleBy(List<Integer> list, int divisor) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (Iterator<Integer> iterator = list.iterator(); iterator
					.hasNext();) {
				Integer i = (Integer) iterator.next();
				if (i > 0 && isOdd(i) && i % divisor == 0)
					returnList.add(i);
			}
		return returnList;
	}

	public ArrayList<Integer> oddAndDivisibleBy(int divisor, Integer... args) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (int i = 0; i < args.length; i++) {
				if (args[i] > 0 && args[i] % 2 != 0 && args[i] % divisor == 0)
					returnList.add(args[i]);
			}
		return returnList;
	}

	public ArrayList<Integer> evenAndDivisibleBy(List<Integer> list, int divisor) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (Iterator<Integer> iterator = list.iterator(); iterator
					.hasNext();) {
				Integer i = (Integer) iterator.next();
				if (i > 0 && i % 2 == 0 && i % divisor == 0)
					returnList.add(i);
			}
		return returnList;
	}

	public ArrayList<Integer> evenAndDivisibleBy(int divisor, Integer... args) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (int i = 0; i < args.length; i++) {
				if (args[i] > 0 && isEven(args[i]) && args[i] % divisor == 0)
					returnList.add(args[i]);
			}
		return returnList;
	}

	public void foobar(List<Integer> list) {
		ArrayList<Integer> listOf3 = divisibleBy(list, 3);
		ArrayList<Integer> listOf5 = divisibleBy(list, 5);
		for (int i = 0; i <= 100; i++) {
			boolean flag = false;
			if (listOf3.contains(i)) {
				System.out.print("foo ");
				flag = true;
			}
			if (listOf5.contains(i)) {
				System.out.print("bar ");
				flag = true;
			}
			if (!flag)
				System.out.print(i);
			System.out.println();
		}
	}

	public void planets(List<Integer> list) {
		ArrayList<Integer> listOf3 = divisibleBy(list, 3);
		ArrayList<Integer> listOf5 = divisibleBy(list, 5);
		ArrayList<Integer> listOf9 = divisibleBy(list, 9);
		for (int i = 0; i <= 100; i++) {
			boolean flag = false;
			if (listOf3.contains(i)) {
				System.out.print("Earth ");
				flag = true;
			}
			if (listOf5.contains(i)) {
				System.out.print("Jupiter ");
				flag = true;
			}
			if (listOf9.contains(i)) {
				System.out.print("Pluto ");
				flag = true;
			}
			if (!flag)
				System.out.print(i);
			System.out.println();
		}
	}
}
