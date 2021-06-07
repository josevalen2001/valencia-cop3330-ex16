package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("What is your age? ");
        int age = newScan.nextInt();

        //Comparison
        boolean legal;

        if(age < 16)
            legal = false;
        else
            legal = true;

        //Output
        String output;
        if(legal)
            output = "You are old enough to drive.";
        else
            output = "You are not old enough to drive";

        System.out.println(output);

    }

}
