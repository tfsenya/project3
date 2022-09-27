import java.util.Scanner;

public class Main {

    //Part 1. If/else and switch Syntax

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.print("Age is greater than 18");
        } else {
            System.out.println("Age is less than 18");
        }
        System.out.println(" ");


        Scanner scp = new Scanner(System.in);
        System.out.println("Enter your age");
        int age2 = scp.nextInt();
        if (age2 <= 18) {
            System.out.print("Age is less or equals 18");
        } else {
            System.out.println("Age is more than 18 and not equals 21");
        }
        System.out.println(" ");


        Scanner scl = new Scanner(System.in);
        System.out.println("Enter your age");
        int age3 = scl.nextInt();
        if (age3 == 18 || age3 == 21) {
            System.out.print("Age is 18 or 21");
        } else {
            System.out.println("Age is not 18 or 21");
        }
        System.out.println(" ");


        Scanner sch = new Scanner(System.in);
        System.out.println("Enter a number from 1-10");
        int number = sch.nextInt();
        String numberstr;
        switch (number) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("even");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("odd");
                break;


        }
        System.out.println(" ");


        //Part 2. Plain conversation
        Scanner qqq = new Scanner(System.in);
        System.out.println("What is your age");
        int age4 = qqq.nextInt();
        if (age4 <= 6){
            System.out.println("Your activities should be home, walk and kindergarten.");
        } else if (age4<=17 && age4>=7) {
            System.out.println("Your activities should be school.");
        } else if (age4<=22 && age4>=18) {
            System.out.println("Your activities should be univercity.");
        } else if (age4>=23 && age4<60) {
            System.out.println("Your activities should be work.");
        } else {
            System.out.println("Your should be retired.");
        }
        System.out.println(" ");


        Scanner aaa = new Scanner(System.in);
        System.out.println("What is your age");
        int age5 = aaa.nextInt();
        if (age5 <= 11){
            System.out.println("You should read a detective book like sherlock holmes");
        } else if (age5<=18 && age4>=11) {
            System.out.println("You should read a non-fiction book like God:An Anatomy");
        } else if (age5<=30 && age4>=18) {
            System.out.println("You should read a buisness book like Rich dad poor dad");
        } else if (age5>=30 && age4<45) {
            System.out.println("You should read a fiction book like 1984");
        } else {
            System.out.println("You should read a science book like Great picture");
        }
        System.out.println(" ");



    }
}