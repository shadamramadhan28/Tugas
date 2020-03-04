/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javashadam;
import java.util.Scanner;
/**
 *
 * @author Shadam Ramadhan
 */
public class JavaShadam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mencetak Hello World
        System.out.println("Hello World!");
        
        System.out.println("CCIT-FTUI");
        
        String name;
        int age;
        boolean condition;
        double score;
        

        name = "Shadam";
        age = 18;
        condition = true;
        score = 3.20;
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(condition);
        System.out.println(score);
        
        
        System.out.print("Masukkan nama anda: ");
        Scanner cetak = new Scanner (System.in);
        String input = cetak.nextLine();
        System.out.println(input);
    
        System.out.print("Nama: ");
        Scanner cetak4 = new Scanner (System.in);
        String input4 = cetak4.nextLine();
        System.out.println(input4);
        
        System.out.print("Hobby: ");
        Scanner cetak1 = new Scanner (System.in);
        String input1 = cetak1.nextLine();
        System.out.println(input1);
        
        System.out.print("Kelebihan: ");
        Scanner cetak2 = new Scanner (System.in);
        String input2 = cetak2.nextLine();
        System.out.println(input2);
        
        System.out.print("Kekurangan: ");
        Scanner cetak3 = new Scanner (System.in);
        String input3 = cetak3.nextLine();
        System.out.println(input3);
    }
    
}
