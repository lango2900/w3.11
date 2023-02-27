package com.program;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Now we will gather data for a specific person.");

        System.out.println("Enter a person's first name ");//#1
        String pfnam1 = scan.nextLine();
        System.out.println("Enter this person's last name ");//#1
        String plnam1 = scan.nextLine();
        System.out.println("Enter this person's age ");
        Integer psage1 = scan.nextInt();
        Person pers1 = new Person(pfnam1,plnam1,psage1);
        scan.nextLine();


        System.out.println("Now lets gather data for their specific house.");

        System.out.println("Enter the street name for the house ");//#1
        String hst1 = scan.nextLine();
        System.out.println("Enter the house number ");//#1
        Integer hnbr1 = scan.nextInt();
        scan.nextLine();// need to "consume" \n
        System.out.println("Enter the house color ");//#1
        String hclr1 = scan.nextLine();
        System.out.println("Enter the square footage ");//#1
        Integer hsf1 = scan.nextInt();
        scan.nextLine();// need to "consume" \n
        House hous1 = new House(hst1,hnbr1,hclr1,hsf1);

        System.out.println(hous1);
        System.out.println(pers1);

    }
}



