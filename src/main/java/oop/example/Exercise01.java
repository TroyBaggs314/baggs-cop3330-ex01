/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */
package oop.example;
import java.util.Scanner;
public class Exercise01
{

    public static void main(String[] args)
    {
        System.out.println("What is your name?");
        String name = readName();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }

    public static String readName()
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;

    }
}
