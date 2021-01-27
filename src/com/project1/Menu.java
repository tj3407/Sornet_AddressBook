package com.project1;

import java.util.Scanner;

public class Menu {
    private static Scanner input = new Scanner(System.in);
    public static String prompt_FirstName() {
        System.out.println("First Name:");
        System.out.print("> ");
        return input.nextLine();
    }
    public static String prompt_LastName() {
        System.out.println("Last Name:");
        System.out.print("> ");
        return input.nextLine();
    }
    public static String prompt_Street() {
        System.out.println("Street:");
        System.out.print("> ");
        return input.nextLine();
    }
    public static String prompt_City() {
        System.out.println("City:");
        System.out.print("> ");
        return input.nextLine();
    }
    public static String prompt_State() {
        System.out.println("State:");
        System.out.print("> ");
        return input.nextLine();
    }
    public static int prompt_Zip() {
        System.out.println("Zip:");
        System.out.print("> ");
        return Integer.parseInt(input.nextLine());
    }
    public static String prompt_Telephone() {
        System.out.println("Telephone:");
        System.out.print("> ");
        return input.nextLine();
    }
    public static String prompt_Email() {
        System.out.println("Email:");
        System.out.print("> ");
        return input.nextLine();
    }
    public static void prompt_Menu() {
        System.out.println("******************");
        System.out.println("Please enter in your menu selection");
        System.out.println("a) Loading From File");
        System.out.println("b) Addition");
        System.out.println("c) Removal");
        System.out.println("d) Find");
        System.out.println("e) Listing");
        System.out.println("f) Quit");
        System.out.println("******************");
        System.out.print("> ");
    }
}
