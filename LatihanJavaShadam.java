/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavashadam;

/**
 *
 * @author Shadam Ramadhan
 */
public class LatihanJavaShadam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int number = 39;
        
        if(number < 10){
            System.out.println("I Love Programming");
        }
        else if (number < 30){
            System.out.println("I Love Programming 2nd");
        }
        else{
            System.out.println("I Still Love Programming");
        }
        
        int number1 = 99;
        
        String hello = (number < 10) ?
                "Hello" : "Not Hello";
        System.out.println(hello);
    }
    }
    
