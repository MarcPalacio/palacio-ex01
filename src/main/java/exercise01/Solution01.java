/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Marc Palacio
 */

/*
 *    - Write an application
 *      that asks the user for name
 *      'user' = read string from user
 *      prints a greeting using user's name
 */

package exercise01;
import java.util.*;

public class Solution01 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("What is your name? ");
        String name = input.nextLine();
        String output = "Hello, " + name + ", nice to meet you!";
        System.out.println(output);
    }
}