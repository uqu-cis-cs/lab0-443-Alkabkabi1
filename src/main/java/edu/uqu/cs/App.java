package edu.uqu.cs;
import java.util.Scanner;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 
    public static void main(String [] args) {
        twisters();
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter a string");
        phoneKeypad(input.nextLine());

        /* Write your code here */
     
       //call method twisters()
       //prompt user to enter a string 
       //call method phoneKeypad(string)


    }
    public static void twisters() {
       

            for (int result = 1; result <= 110; result++) {
    
                if (result % 2 == 0) {
                    System.out.print("Tweetle");
    
                    if (result % 4 == 0) {
                        System.out.print("Beetle");
                    }
    
                    if (result % 6 == 0) {
                        System.out.print("Poodle");
                    }
                }
                else {
                    System.out.print(" " + result + " ");
                }
            }
        }

    
    

      
      
        
       
        public static void phoneKeypad(String text) {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.toUpperCase().charAt(i);
                if (ch >= 'A' && ch <= 'C') {
                    result += "2";
                } else if (ch >= 'D' && ch <= 'F') {
                    result += "3";
                } else if (ch >= 'G' && ch <= 'I') {
                    result += "4";
                } else if (ch >= 'J' && ch <= 'L') {
                    result += "5";
                } else if (ch >= 'M' && ch <= 'O') {
                    result += "6";
                } else if (ch >= 'P' && ch <= 'S') {
                    result += "7";
                } else if (ch >= 'T' && ch <= 'V') {
                    result += "8";
                } else if (ch >= 'W' && ch <= 'Z') {
                    result += "9";
                }
            }
            System.out.println(result);
        }
}
