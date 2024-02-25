package com.preWorkAssignmentSolution;
import java.util.Scanner;
public class Main {
    Scanner sc=new Scanner(System.in);
  //function to checkPalindrome

    public void checkPalindrome()  {
    	System.out.println("Enter the number you wanted to"
    			+ " Check the Palindrome:");
        int n=sc.nextInt();
        int temp=n;
        int reverse=0,remainder;
         while(n!=0) {
        	 remainder=n%10;
        	 reverse=reverse*10+remainder;
        	 n/=10;
         }
         if(reverse==temp) {
        	 System.out.println(temp+" is Palindrome Number");
         }else {
        	 System.out.println(temp+" is Not A Palindrome Number");
         }
         System.out.println();
    	
   }

         //function to printPattern

    public void printPattern() {
    	  System.out.println("Enter the number to print the pattern:");
          int n=sc.nextInt();
          if(n>0) {
          for(int i=n;i>0;i--) {
        	  for(int j=0;j<i;j++) {
        		  System.out.print("*");
        	  }
        	  System.out.println();
          }
          }else {
        	  System.out.println("Enter Valid Number");
          }  
          System.out.println();
   }



       //function to check no is prime or not

     public void checkPrimeNumber() {
        System.out.println("Enter the a number to check whether it's a primeNumber:");
        int value=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=value/2;++i) {
        	if(value%i==0) {
        		flag=true;
        		break;
        	}
        }
        if(!flag) {
        	System.out.println(value+" is a Prime Number");
        }else {
        	System.out.println(value+" is Not a Prime Number");
        }
        System.out.println();
     }

      

       // function to print Fibonacci Series

       public void printFibonacciSeries() {
       System.out.println("Enter the number to print the Fibonacci Series of that number:");
       int n=sc.nextInt();
        //initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;int sum;
        if(n==0) {
        	System.out.println("The fibonacci series is: "+first);
        }else if(n==1) {
        	System.out.println("The fibonacci series is: "+first+","+second);
        }else {
        	System.out.print("The fibonacci series is: "+first+","+second);
        
        while(n>1) {
        	sum=first+second;
        	System.out.print(","+sum);
        	first=second;
        	second=sum;
        	n-=1;
        	
        }
        }
        System.out.println();
        System.out.println();
       }
	public static void main(String[] args) {
		Main obj=new Main();
		
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter your choice from below list:\n"
				+"1.Find the Palindrome Number:\n"
				+"2.Print Pattern for given Number:\n"
				+"3.Check Whether the number is a Prime Number:\n"
				+"4.Print Fibonacci Series for a Given Number:\n"
				+"--> Enter 0 to Exit.\n");
		System.out.println();
		choice=sc.nextInt();
		switch(choice) {
		case 0:
			choice=0;
			break;
		case 1:{
			obj.checkPalindrome();
		}break;
		case 2:{
			obj.printPattern();
		}break;
		case 3:{
			obj.checkPrimeNumber();
		}break;
		case 4:{
			obj.printFibonacciSeries();
		}break; 
		default:
			System.out.println("Invalid choice.Enter a valid Number.\n");
		}
		
	    	}while(choice!=0);
		System.out.println("Exited successfully!!!");
		sc.close();
	}
	

}
