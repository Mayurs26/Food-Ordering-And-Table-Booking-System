package com.FinalProject;

import java.util.LinkedList;
import java.util.Scanner;


public class Paradise 
{
	LinkedList a1=new LinkedList();
	Scanner sc = new Scanner(System.in);
	TableOfParadise t []= new TableOfParadise[3];
	MenuOfParadise m;
	int order;
//	AccountOfParadise a;
	
	
//	public void createAccount()
//	{
//		System.out.println("Enter Name");
//		String name=sc.next();
//		System.out.println("Enter Phone Number");
//		int Phone_no=sc.nextInt();
//		System.out.println("Enter Address");
//		String address=sc.next();
//		AccountOfParadise a=new AccountOfParadise(name,Phone_no,address);
//		a1.add(a);
//		System.out.println("Account Is Added");
//		System.out.println("1.Continue 2.Stop");
//		if(sc.nextInt()==1)
//			storeInArray();
//	}
	
	
	public void bookTable()
	{
//		if(a1.size()==0)
//		{
//			System.out.println("First Sign Up");
//		}
//		else
//		{
		System.out.println("Enter Number of Guest");
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter Name");
			String name=sc.next();
			
			TableOfParadise t1=new TableOfParadise(name);
			a1.add(t1);
			if(a1.size()<=t.length)
			{
				System.out.println("Table is Booked In Paradise");
				System.out.println("Please Order Some Food");
				System.out.println("--._.----._.----._.----._.----._.----");
				System.out.println();
				storeInArray();
			}
			else
			{
				System.out.println("Guest please wait for some time........");
				int tokan = a1.indexOf(t1)-t.length+1;
				System.out.println("Guest your Tokan no is :- "+tokan);
			}
			return;
		}
		else if(n==2)
		{
			System.out.println("Enter First Guest Name");
			String name=sc.next();
			
			System.out.println("Enter Second Guest Name");
			String name1=sc.next();
			
			TableOfParadise t1=new TableOfParadise(name,name1);
			a1.add(t1);
			if(a1.size()<t.length)
			{
				System.out.println("Table is Booked In Paradise");
				System.out.println("please order some food");
				System.out.println("--._.----._.----._.----._.----._.----");
				System.out.println();
				storeInArray();
			}
			else
			{
				System.out.println("Guest please wait for some time........");
				int tokan = a1.indexOf(t1)-t.length+1;
				System.out.println("Guest your Tokan no is :- "+tokan);
			}
			return;
		}
		else 
		{
			System.out.println("Only Two Guest Are Allowed :(");
		}
	}
//	}
	
	
	//This Is Method Of Displaying Table Details
	public void displayTable()
	{
		if(a1.size()!=0)
		{
			for (int i = 0; i < t.length; i++) 
			{
				
					System.out.println(t[i]);
			}
		}
		else
	    {
	    	System.err.println("Data Not Found");
	    }
	}
	
	//This Is Method Of Storing The Array
	public void storeInArray()
	{
		if(a1.size()!=0)
		{
			for (int i = 0; i < t.length; i++) 
			{
				try
				{
					t[i]=(TableOfParadise) a1.get(i);
				}
				catch(IndexOutOfBoundsException e)
				{
					
				}
				
			}
		}
		
	}
	
	
	
	
	//This Is Method Of Canceling Table Details
	public void cancelTable()
	{
		if(a1.size()!=0)
		{
			System.out.println("Enter Name");
			String name=sc.next();
			for(int i=0;i<a1.size();i++)
			{
				Object obj=a1.get(i);
				TableOfParadise t1=(TableOfParadise)obj;
				if(t1.name.equals(name))
				{
					a1.remove(t1);
					try
					{
						t[i]=null;
					}
					catch(IndexOutOfBoundsException e)
					{
						
					}
					storeInArray();
					System.out.println("Table Is Cancelled");
					return;
				}
			}
			System.err.println("User Name Not Found");
			return;
		}
	    else
	    {
	    	System.err.println("Data Not Found");
	    }
	}
	
	//This Is Method Of Displaying Waiting Details
	public void waitingList()
	{
		if(a1.size()!=0)
		{
			System.out.println("    Waiting List Of Paradise    ");
			for (Object o : a1)
			{
                boolean found = false;
                for (Object o1 : t)
                {
                     if (o.equals(o1)) 
                     {
                         found = true;
                         break;
                     }
                }
                if (!found) 
                {
                    System.out.println(o);
                }
			}
		}
	    else
	    {
	    	System.err.println("Data Not Found");
	    }
//		System.out.println("Data Not Found");
	}
	
	//This Is The Method Of Ordering Food For User
	public void orderFood()
	{
		if(a1.size()!=0)
		{
		System.out.println("1. Veg 2. NonVeg");
		int s1=sc.nextInt();
		switch(s1)
		{
		case 1:
			if(a1.size()!=0)
			{
				m = new ParadiseVeg();
				System.out.println("Enter Name");
				String name=sc.next();
				try {
					
				
				for(int i=0;i<t.length;i++)
				{
					Object obj=a1.get(i);
					TableOfParadise t1=(TableOfParadise)obj;
					boolean control=false;
					if(t1.name.equals(name))
					{
						if(m instanceof ParadiseVeg)
						{
							 order=0;
							 ParadiseVeg a1 =  (ParadiseVeg)m;
							 
							 System.out.println("           MENU OF PARADISE             ");
							 System.out.println();
								
							 do
								{
								    System.out.println("1."+a1.food1+"  "+a1.foodprice1);	
								    System.out.println("2."+a1.food2+"  "+a1.foodprice2);	
								    System.out.println("3."+a1.food3+"  "+a1.foodprice3);	
								    System.out.println("4."+a1.food4+"  "+a1.foodprice4);	
								    System.out.println("5."+a1.food5+"  "+a1.foodprice5);	
								    System.out.println("6."+a1.food6+"  "+a1.foodprice6);	
								    System.out.println("7."+a1.food7+"  "+a1.foodprice7);	
								    System.out.println("8."+a1.food8+"  "+a1.foodprice8);	
								    switch(sc.nextInt())
								    {
								    case 1:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty1=sc.nextInt();
								    	  order++;
								    	break;
								    	
								    case 2:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty2=sc.nextInt();
								    	  order++;
								    	break;
								    case 3:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty3=sc.nextInt();
								    	  order++;
								    	break;
								    case 4:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty4=sc.nextInt();
								    	  order++;
								    	break;
								    case 5:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty5=sc.nextInt();
								    	  order++;
								    	break;
								    case 6:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty6=sc.nextInt();
								    	  order++;
								    	break;
								    case 7:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty7=sc.nextInt();
								    	  order++;
								    	break;
								    case 8:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty8=sc.nextInt();
								    	  order++;
								    	break;
								    	
								    }
								  
								  
								 System.out.println("1.You Wanna Order 2.Stop"); 
								 if(sc.nextInt()==1)
									 control=true;
								 else
									 control=false;
								}
								while(control);
						}
							 return;
					}
				}
				} catch (Exception e) {
					
					System.out.println("User Name Not Found");
				}
				return;
				
			}
		    else
		    {
		    	System.err.println("Data Not Found");
		    }
			
			break;
			
		case 2:
			if(a1.size()!=0)
			{
				m = new ParadiseNonVeg();
				System.out.println("Enter Name");
				String name=sc.next();
				try {
					
				
				for(int i=0;i<t.length;i++)
				{
					Object obj=a1.get(i);
					TableOfParadise t1=(TableOfParadise)obj;
					boolean control=false;
					if(t1.name.equals(name))
					{
						if(m instanceof ParadiseNonVeg)
						{
							 order=0;
							 ParadiseNonVeg a1 =  (ParadiseNonVeg)m;
								
							 
							 System.out.println("           MENU OF PARADISE             ");
							 System.out.println();
							 do
								{
								    System.out.println("1."+a1.food1+"  "+a1.food1price1);	
								    System.out.println("2."+a1.food2+"  "+a1.food1price2);	
								    System.out.println("3."+a1.food3+"  "+a1.food1price3);	
								    System.out.println("4."+a1.food4+"  "+a1.food1price4);	
								    System.out.println("5."+a1.food5+"  "+a1.food1price5);	
								    System.out.println("6."+a1.food6+"  "+a1.food1price6);	
								    System.out.println("7."+a1.food7+"  "+a1.food1price7);	
								    System.out.println("8."+a1.food8+"  "+a1.food1price8);	
								    switch(sc.nextInt())
								    {
								    case 1:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty1=sc.nextInt();
								    	  order++;
								    	break;
								    	
								    case 2:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty2=sc.nextInt();
								    	  order++;
								    	break;
								    case 3:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty3=sc.nextInt();
								    	  order++;
								    	break;
								    case 4:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty4=sc.nextInt();
								    	  order++;
								    	break;
								    case 5:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty5=sc.nextInt();
								    	  order++;
								    	break;
								    case 6:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty6=sc.nextInt();
								    	  order++;
								    	break;
								    case 7:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty7=sc.nextInt();
								    	  order++;
								    	break;
								    case 8:
								    	System.out.println("Please Enter qty"+(char)2);
								    	a1.qty8=sc.nextInt();
								    	  order++;
								    	break;
								    	
								    }
								  
								  
								 System.out.println("1.You Wanna Order 2.Stop"); 
								 if(sc.nextInt()==1)
									 control=true;
								 else
									 control=false;
								}
								while(control);
						}
							 return;
					}
				}
				} catch (Exception e) {
					
					System.out.println("User Name Not Found");
				}
				return;
				
			}
		    
	
		}
		
			   
	}
		else
	    {
	    	System.err.println("Data Not Found");
	    }
	}
	
	
	
	
//	public void chooseHotel()
//	{
//		System.out.println("enter name");
//		String name=sc.next();
//		for(int i=0;i<al.size();i++)
//		{
//			Object obj=al.get(i);
//			Account a=(Account)obj;
//			if(name.equals(a.name))
//			{
//				System.out.println("1.a1 hotel 2.a2 hotel");
//				switch(sc.nextInt())
//				{
//				case 1:
//					h=new A1Hotel();
//					System.out.println("a1 hotel is choosed ");
//				     return;
//				case 2:
//					h=new A2Hotel();
//					System.out.println("a2 hotel is choosed");
//					return;
//					
//					default:
//						return;
//				}
//			}
//			
//		}
//		System.out.println("user name is not found");
//	}
	
//	public void makeAOrder()
//	{
//		
//		boolean control=false;
//		
//			order=0;
//			A1Hotel a1=(A1Hotel)h;
//			do
//			{
//			    System.err.println("1."+a1.food1+"  "+a1.food1price1);	
//			    System.err.println("2."+a1.food2+"  "+a1.food1price2);	
//			    System.err.println("3."+a1.food3+"  "+a1.food1price3);	
//			    System.out.println("4."+a1.food4+"  "+a1.food1price4);	
//			    System.out.println("5."+a1.food5+"  "+a1.food1price5);	
//			    System.out.println("6."+a1.food6+"  "+a1.food1price6);	
//			    System.out.println("7."+a1.food7+"  "+a1.food1price7);	
//			    System.out.println("8."+a1.food8+"  "+a1.food1price8);	
//			    switch(sc.nextInt())
//			    {
//			    case 1:
//			    	System.out.println("plese enter qty"+(char)2);
//			    	a1.qty1=sc.nextInt();
//			    	  order++;
//			    	break;
//			    	
//			    case 2:
//			    	System.out.println("plese enter qty"+(char)2);
//			    	a1.qty2=sc.nextInt();
//			    	  order++;
//			    	break;
//			    case 3:
//			    	System.out.println("plese enter qty"+(char)2);
//			    	a1.qty3=sc.nextInt();
//			    	  order++;
//			    	break;
//			    case 4:
//			    	System.out.println("plese enter qty"+(char)2);
//			    	a1.qty4=sc.nextInt();
//			    	  order++;
//			    	break;
//			    case 5:
//			    	System.out.println("plese enter qty"+(char)2);
//			    	a1.qty5=sc.nextInt();
//			    	  order++;
//			    	break;
//			    case 6:
//			    	System.out.println("plese enter qty"+(char)2);
//			    	a1.qty6=sc.nextInt();
//			    	  order++;
//			    	break;
//			    case 7:
//			    	System.out.println("plese enter qty"+(char)2);
//			    	a1.qty7=sc.nextInt();
//			    	  order++;
//			    	break;
//			    case 8:
//			    	System.out.println("plese enter qty"+(char)2);
//			    	a1.qty8=sc.nextInt();
//			    	  order++;
//			    	break;
//			    	
//			    }
//			  
//			  
//			 System.out.println("1.you wanna order 2.stop"); 
//			 if(sc.nextInt()==1)
//				 control=true;
//			 else
//				 control=false;
//			}
//			while(control);
//		
//		else if(h instanceof A2Hotel)
//		{
//			A2Hotel a1=(A2Hotel)h;
//		}
		
//	}
	
	
	
	//This Is Method Of Displaying Bill Details To User And Payment Path
	public void displayBill()
	{
		
		 double sum=0;
		int list=0;
	    if(order==0)
	    	System.out.println("Please Order Some Food");
	    else
	    {
	    	if(m instanceof ParadiseVeg)
	    	{
	    	 	ParadiseVeg a1=(ParadiseVeg)m;
	    	 	if(a1.qty1!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food1+"  "+a1.foodprice1+"  "+a1.qty1+" = "+a1.qty1*a1.foodprice1);
	    	 	     sum=sum+a1.qty1*a1.foodprice1;
	    	 	}
	    	 	if(a1.qty2!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food2+"  "+a1.foodprice2+"  "+a1.qty2+" = "+a1.qty2*a1.foodprice2);
	    	 		 sum=sum+a1.qty2*a1.foodprice2;
	    	 	}
	    	 	if(a1.qty3!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food3+"  "+a1.foodprice3+"  "+a1.qty3+" = "+a1.qty3*a1.foodprice3);
	    	 		 sum=sum+a1.qty3*a1.foodprice3;
	    	 	}
	    	 	if(a1.qty4!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food4+"  "+a1.foodprice4+"  "+a1.qty4+" = "+a1.qty4*a1.foodprice4);
	    	 		 sum=sum+a1.qty4*a1.foodprice4;
	    	 	}
	    	 	if(a1.qty5!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food5+"  "+a1.foodprice5+"  "+a1.qty5+" = "+a1.qty5*a1.foodprice5);
	    	 		 sum=sum+a1.qty5*a1.foodprice5;
	    	 	}
	    	 	if(a1.qty6!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food6+"  "+a1.foodprice6+"  "+a1.qty6+" = "+a1.qty6*a1.foodprice6);
	    	 		 sum=sum+a1.qty6*a1.foodprice6;
	    	 	}
	    	 	if(a1.qty7!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food7+"  "+a1.foodprice7+"  "+a1.qty7+" = "+a1.qty7*a1.foodprice7);
	    	 		 sum=sum+a1.qty7*a1.foodprice7;
	    	 	}
	    	 	if(a1.qty8!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food8+"  "+a1.foodprice8+"  "+a1.qty8+" = "+a1.qty8*a1.foodprice8);
	    	 		 sum=sum+a1.qty8*a1.foodprice8;
	    	 	}
	    	 	System.out.println("_________________________________________________");
	    	 	System.out.println("Total                          "+sum);
	    	 	
	    	 	//Here Is Payment Will Starts
				System.out.println("You Have To Pay "+sum);
				System.out.print("Pay : ");
				double money=sc.nextDouble();
				if(money>=sum)
				{
					System.out.println("Your Order Is Placed");
					m=null;
				}
				else
				{
					System.out.println("Order Is Not Confirmed");
				}
				
	    	 	
	    	}
	    	else if(m instanceof ParadiseNonVeg)
	    	{
	    		ParadiseNonVeg a1=(ParadiseNonVeg)m;
	    	 	if(a1.qty1!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food1+"  "+a1.food1price1+"  "+a1.qty1+" = "+a1.qty1*a1.food1price1);
	    	 	     sum=sum+a1.qty1*a1.food1price1;
	    	 	}
	    	 	if(a1.qty2!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food2+"  "+a1.food1price2+"  "+a1.qty2+" = "+a1.qty2*a1.food1price2);
	    	 		 sum=sum+a1.qty2*a1.food1price2;
	    	 	}
	    	 	if(a1.qty3!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food3+"  "+a1.food1price3+"  "+a1.qty3+" = "+a1.qty3*a1.food1price3);
	    	 		 sum=sum+a1.qty3*a1.food1price3;
	    	 	}
	    	 	if(a1.qty4!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food4+"  "+a1.food1price4+"  "+a1.qty4+" = "+a1.qty4*a1.food1price4);
	    	 		 sum=sum+a1.qty4*a1.food1price4;
	    	 	}
	    	 	if(a1.qty5!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food5+"  "+a1.food1price5+"  "+a1.qty5+" = "+a1.qty5*a1.food1price5);
	    	 		 sum=sum+a1.qty5*a1.food1price5;
	    	 	}
	    	 	if(a1.qty6!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food6+"  "+a1.food1price6+"  "+a1.qty6+" = "+a1.qty6*a1.food1price6);
	    	 		 sum=sum+a1.qty6*a1.food1price6;
	    	 	}
	    	 	if(a1.qty7!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food7+"  "+a1.food1price7+"  "+a1.qty7+" = "+a1.qty7*a1.food1price7);
	    	 		 sum=sum+a1.qty7*a1.food1price7;
	    	 	}
	    	 	if(a1.qty8!=0)
	    	 	{
	    	 		System.out.println(++list+" ."+a1.food8+"  "+a1.food1price8+"  "+a1.qty8+" = "+a1.qty8*a1.food1price8);
	    	 		 sum=sum+a1.qty8*a1.food1price8;
	    	 	}
	    	 	
	    	 	System.out.println("_________________________________________________");
	    	 	System.out.println("Total                          "+sum);
	    	 	
	    	 	//Here Is Payment Will Starts
				System.out.println("You Have To Pay "+sum);
				System.out.print("Pay : ");
				double money=sc.nextDouble();
				if(money>=sum)
				{
					System.out.println("Your Order Is Placed");
					m=null;
				}
				else
				{
					System.out.println("Order Is Not Confirmed");
				}
	    	}
	    }
	}

}
