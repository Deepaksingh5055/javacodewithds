package javavideo;

import java.util.Scanner;

public class firstjavaclass {

	public static void main(String[] args) {
//		System.out.println("Hello");
//   int4bits float char string long8bits double,boolean
//		int age=18;
//		float avgmarks=90.345f;
//		char grade='A';
//		String name="Anuj";
//		boolean isvalid=false;
//		long bignumber=777788885558855l; //2^18
//		
//		System.out.println(age);
//		System.out.println(avgmarks);
//		operators  
//		Arithmetic op +,-/,*,++ --
//		int firstNumber=1234;
//		int secondNumber=234;
//		double sum=(double)firstNumber % (double)secondNumber;
//		System.out.println(sum);
////		
//		int a=12;
//		System.out.println(a++); 
//		// this stmt increaent by 1
//		a--;
//		System.out.println(a);
		// Assignment operator = ==
         // Taking user input
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name=sc.nextLine();
//		System.out.println(name);
//		condational stmt >,<,>=,<=,==,!=
//		int age=12;
//		if(age>18) {
//	System.out.println("you can vote");
//		}  else {
//	System.out.println("you can not vote");
//		}
//		boolean isEqual=18==18;
//		System.out.println(19<18);
//		char grade='c';
//		if(grade=='A') {
//	System.out.println("your grade is very good");
//			
//		} else if(grade=='B') {
//			System.out.println("very good ,keep learning");
//			
//		} else if(grade=='c') {
//			System.out.println("keep improvement");
//			
//		} else {
//			System.out.println("invlide grade");
//		}
//		switch case
//		char grade='A';
//		switch(grade) {
//		case 'A':
//System.out.println("your grade is very good");
//		break;
//		case 'B':
//			System.out.println("very good ,keep learning");
//			break;
//		case 'c':
//			System.out.println("keep improvement");
//			break;
//			default:
//				System.out.println("wrong argument");
//				
//		logical op
		// 1 &&(two con 1 con is false false) 2(true two con one con is true then true) || 3 !
//		int age =50;
////		if(age >18 || age < 50) {
//		if(!(age >18) ) {
//			System.out.println("you can vote");
//		} else {
//			System.out.println("you can not vote");
//		}
		// Loops 
//		for, while ,do-while
//		 syntax for(;;){}
//		for(int i =0; i < 10; i++) {
//			System.out.println("Deepak" + i);
//		}
//		int a=23;
//		while(a <= 100) {
//			a++;
//			if(a == 65) continue;
//			System.out.println(a);
//			a++;
//			if(a > 100) {
//				break;
//			}
//		}
//		int a=23;
//		do {
//			System.out.println(a);
//			a++;
//		} while(a <= 100);
//			
//		
		// Arrays 
//		int marks []= new int[5];
//		marks[0]=23;
//		marks[1]=12;
//		marks[2]=56;
//		marks[3]=34;
//		marks[4]=99;
//		int marks []= {23,12,56,34,99,12,34};
//		for(int i= 0; i<marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
//		int a [] [] =new int [2][3];
//		int a [] []= {
//				{
//					1,2
//				} ,{
//					3,4
//					}
//		};
//		
//		System.out.println( a[1][0]);
//		System.out.println(average(3,6));
//		exception handling
		
		int a[]= new int[3];
		try {
		System.out.println(a[4]);
		System.out.println(2/0);
		} catch(Exception e) {
			System.out.println("Error aaya tha");
			
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("niche ka line");
		
		
    }
//				
				
//				methods 
//		
//		return type,function name,(arguments){}
		
//static int average(int firstNumber,int secondNumber) {	
//	  int sum = firstNumber + secondNumber;
//	  return sum / 2;
//				
// 
//		
	
//	}

}
