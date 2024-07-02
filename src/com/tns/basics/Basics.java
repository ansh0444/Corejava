package com.tns.basics;
import java.util.*;
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
         Scanner sc =new Scanner(System.in);
         int a= sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();

         //comparing a b c
         if(a>b && a>c){
             System.out.println("a is greater than b and c");
         }
         if(b>a && b>c){
             System.out.println("b is greater than a and c");
         }
         else{
             System.out.println("c is greater than a and b");
         }

        //nested for loop print table from 10 -20

          for(int i=10;i<=20;i++){
              for(int j=1;j<=10;j++){
                  System.out.print(i*j+" ");
              }
              System.out.println();
          }
        
        //check if age is 18 and nation is indian

         
         int age=sc.nextInt();
         String nat = sc.next();
         String x="Indian";

         if(age>18){
             if(nat==x){
                 System.out.println("Eligible");
             }
             else{
                 System.out.println("Not eligible");
             }
         }
         else{
             System.out.println("Age is less than 18");
         }
	}

}
