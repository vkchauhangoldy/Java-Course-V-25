package variables;

import java.util.Scanner;

public class Variables {

    int findSquare(int a, int b){
        return a*b;
    }


    void main(String[] args) {
        int num=40;
        System.out.println("This is a number variable: " + num);

        double d=48.859;
        float f= 89.0f;
        System.out.println("This is double value: "+ d);
        System.out.println("This is float value: "+ f);



        int length=339;
        int width=84;
        int sum= length+width;
//        width=65;
        int multi=length*width;
        int square= findSquare(length,width);

        IO.println("The calculated square is: " + square);

        System.out.println("Sum: " + sum);
        System.out.println("Multi: " + multi);


        int a=10;
        int b=5;
        int ans1= a*b/a-b;
        int ans2= (a*b)/(a-b);
        IO.println("ans1: "+ ans1);
        IO.println("ans2: "+ans2);

//taking input

        Scanner sc= new Scanner(System.in);
        IO.println("Please enter the name");
//        String name=sc.next(); // for single word
        String name=sc.nextLine(); // for full sentence

        IO.println("name is: "+name);

        //take input from user and print sum
        IO.println("Enter first number: ");
        int x= sc.nextInt();
        IO.println("Enter second number: ");
        int y= sc.nextInt();

        int res = x+y;
        System.out.println("The total sum is: "+ res);


    }
}
