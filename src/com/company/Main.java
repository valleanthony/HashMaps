package com.company;

import jdk.nashorn.internal.ir.CatchNode;

import javax.lang.model.util.ElementScanner6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> mymap = new HashMap<Integer, String>(); // Making a new Hashmap


        //Adding some values to the Hashmap.
        mymap.put(1, "One");
        mymap.put(2, "Two");
        mymap.put(3, "Three");
        mymap.put(4, "Four");
        mymap.put(5, "Five");

        //initializing an empty variable.
        int searchMe;
        String emptyString ="";
        int value;
        //Making a scanner for user input.
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter a number:  ");
        searchMe = keyboard.nextInt();
        /*
        The if statement will check to see if the number is within the hash map.
        If the number is not present then the if statement will ask the user to spell
        word and store it withing the hash map.
         */

        keyboard.nextLine();
        if (mymap.containsKey(searchMe) == false){
            System.out.println("How do you spell this number? ");
            emptyString = keyboard.nextLine();


        }
        else{
            System.out.print("This is how you spell your number: "+ mymap.get(searchMe));
        }


        mymap.put(searchMe,emptyString);
        System.out.println(mymap);

        //Writing the values in the hashmap to a file.
        System.out.println("Writing keys and values to a file.");
        String fileName = (System.getProperty("user.dir")) + File.separatorChar +"HashMap101.txt";
        System.out.println(fileName);

        PrintWriter writer = null;
        try{
            writer  = new PrintWriter(new File(fileName));
        } catch (FileNotFoundException e){
            System.out.println("ERROR");
        }
        //print both the key and the value on same line
        // for each key in the key set write the key, a tab and the value
        for (int key : mymap.keySet()) {
            System.out.println("write this line: " + key);
            writer.println(key + "\t" + mymap.get(key));
        }
        writer.close();






    }
}
