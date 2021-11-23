package com.bridgelabz.sweetshopmanagement;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	
	public void printAllSweet(Set<Sweet>sweetList) {
		
	    	for (Sweet sweet: sweetList) {
				System.out.println(sweet);
			}
	 }
		 public int showUserMenu() {
			 System.out.println("Enter \n1.Add sweet\n2.Remove sweet" + "\n3.Update sweet \n4.Print sweet \n" +Application.exitValue + ".Exit");
			 Scanner sc = new Scanner(System.in);
			 int input = sc.nextInt();
			 return input;
	   }
	}







//for(int i = 0; i < sweetList.size(); i++){
//	System.out.println(sweetList.get(i));
//}