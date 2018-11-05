package com.xjf.test.test;

import java.util.Stack;

public class replaceMi 
{
	public static void main(String[] args) 
	{
		String word = "ammiimiid";
		
		System.out.println( replace(word));
	}
	
	public static String replace(String src)
	{
		if(null==src||src.length()<=0)
		{
			return "";
		}
		String result = "";
		char[] src_list = src.toCharArray();
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<src_list.length;i++)
		{
			if(stack.isEmpty())
			{
				stack.push(src_list[i]);
			}
			else
			{
				char first = (Character) stack.peek();
				String combine = "" + first + src_list[i];
				if(combine.equals("mi"))
				{
					stack.pop();
				}
				else
				{
					stack.push(src_list[i]);
				}
			}
		}
		for(int j=0;j<stack.size();j++)
		{
			result += stack.get(j);
		}
		return result;
	}

}
