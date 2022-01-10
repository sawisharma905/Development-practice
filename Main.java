package com.company;
import java.util.Scanner;
public class Main {

    static int sum(int a, int b){
        return (a+b);
    }
    static int diff(int a, int b){
        return (a-b);
    }
    static int prod(int a, int b){
        return (a*b);
    }
    static float div(int a, int b){
        return (a/b);
    }
    static int modu(int a, int b){
        return (a%b);
    }

    public static void main(String[] args) {
	// write your code he
        Scanner input= new Scanner(System.in);
        //taking input of the numbers from the user
        System.out.println("Input the numbers:");
        int x=input.nextInt();
        int y= input.nextInt();
        System.out.print("Choose the action you want to perform (1.Sum, 2. difference, 3.Product, 4.Division, 5.Modulus):");
        int choice= input.nextInt();
        int ans;
        float divans;
        switch (choice){
            case 1: ans =sum(x,y);
                System.out.println(ans); break;
            case 2: ans=diff(x,y);
                System.out.println(ans); break;
            case 3: ans=prod(x,y);
                System.out.println(ans); break;
            case 4: divans=div(x,y);
                System.out.println(divans); break;
            case 5: ans=modu(x,y);
                System.out.println(ans); break;
            default:
                System.out.println("Invalid Input"); break;
        }
    }

}
