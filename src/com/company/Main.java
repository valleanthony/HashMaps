package com.company;

import javax.lang.model.util.ElementScanner6;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String>mymap = new HashMap<Integer, String>(); // Making a new Hashmap


        //Adding some values to the Hashmap.
        mymap.put(1,"One");
        mymap.put(2,"Two");
        mymap.put(3,"Three");
        mymap.put(4,"Four");
        mymap.put(5,"Five");

        //initializing an empty variable.
        int searchMe;
        boolean foundTheNumber = false;
        //Making a scanner for user input.
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter a int and I will spell it ");
        searchMe = keyboard.nextInt();

        /*
        The if statement will check to see if the number is within the hash map.
        If the number is not present then the if statement will ask the user to spell
        word and store it withing the hash map.
         */
        String emptyString;

                mymap.keySet(searchMe);

            if (searchMe!= {
                System.out.println("How do you spell this number? ");
                keyboard.nextLine();
                mymap.put(searchMe,emptyString);
            }
            else{
                int value = mymap.get(searchMe);
                System.out.println(value);

            }







    }
}
