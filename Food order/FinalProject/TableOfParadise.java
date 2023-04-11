package com.FinalProject;

public class TableOfParadise 
{
	String name;
	String name1;

	int tokan;
	public TableOfParadise(String name) 
	{
		this.name = name;
		
	}
	public TableOfParadise(String name, String name1) 
	{
		this.name = name;
		this.name1 = name1;
		
	}
	public String toString()
	{
		
		return "Username :- "+ name +"\t"+"partner :- "+ name1;
	}


}
