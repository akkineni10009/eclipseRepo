package Stacks;

import java.util.ArrayList;

public class StackWithArrayList {
	
	static ArrayList<Object> stackList = new ArrayList<Object>();
	static int top=-1;
	
	public static void main(String[] args)
	{
		push(5);
		push(2.502);
		push(1);
		push("Ajay");
		push(3);
		
		pop();
		printList();
		
	}
	
	private static void push(Object data)
	{
		stackList.add(++top,data);
	}
	
	private static void pop()
	{
		stackList.remove(top--);
	}
	
	private static void printList()
	{
		for(Object element: stackList)
		{
			System.out.println(element);
		}
	}
}
