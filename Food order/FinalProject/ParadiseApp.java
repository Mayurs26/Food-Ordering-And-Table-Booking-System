package com.FinalProject;

import java.util.Scanner;

public class ParadiseApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Paradise h=new Paradise();
		
		for(;;)
		{
			System.out.println();
			System.out.println("__.-.____.-.______.-.__PARADISE__.-.______.-.____.-.__");
			System.out.println();
			System.out.print("1. Book A Table "+"\t"+"2. Cancel Table "+"\t"+"3. Display Table"+"\n"+"4. Waiting List"+"\t"+"\t");
			System.out.println("5. Order Food "+"\t"+"\t"+"6. Display Bill "+"\t"+"7. Exit ");
			switch(sc.nextInt())
			{
//		case 1: 
//			h.createAccount();
//			break;
		case 1 :
			h.bookTable();
			break;
		case 2 :
			h.cancelTable();
			break;
		case 3 :
			h.displayTable();
			break;
		case 4 :
			h.waitingList();
			break;
		case 5 :
			h.orderFood();
			break;
		case 6 :
			h.displayBill();
			break;
		case 7 :
			System.out.println("Application Is Closed");
			return;
			
		}
		
	}
	
	}

}
