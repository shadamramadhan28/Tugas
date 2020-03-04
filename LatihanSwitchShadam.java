/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanswitchshadam;
import java.util.Scanner;
/**
 *
 * @author Shadam Ramadhan
 */
public class LatihanSwitchShadam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan teks: ");
        Scanner input = new Scanner(System.in);
        String hasil = input.nextLine();
        
        switch (hasil){
            case "1":
                System.out.println("Hello World");
                break;
            case "2":
                System.out.println("Shadam Is Adorable");
                break;
            default:
                System.out.println("No Option!");
                break;
        }
        
    //Switch similar like If
        System.out.print("Masukkan kata: ");
        Scanner inputan = new Scanner(System.in);
        String words = inputan.nextLine();
        
        //case 1
        if(words.equals("1")){
            System.out.println("Hello World!");
        }
        //case 2
        else if(words.equals("2")){
            System.out.println("Shadam is Adorable");
        }
        //default
        else{
            System.out.println("No Option!");
        }


// SIMPLY TASK
        System.out.print("Masukkan input: ");
        Scanner angka = new Scanner(System.in);
        int number = angka.nextInt();
        
        if(number < 10){
            System.out.println("Under 10!");
        }
        else if(number <= 31){
            System.out.println("Above 10 and Under 30");
        }
        else{
            System.out.println("Above 31!");
        }

//LOOPING
        //for
        int max = 10;
        for (int i = 0; i < max; i++){
            System.out.println(i);
        }
        
        //foreach
        int arr[] = {3, 1, 2, 5, 4};
        
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        String letters[] = {"Hello", "World", "Shadam", "Is", "Adorable"};
        
        for (String letter : letters) {
            System.out.println(letter);
        }
        
        //While Do
        int maks = 10;
        int i = 0;
        while (i < maks){
            System.out.println("Hello World!");
            i++;
        }
        
        //using Do While
        int maxx = 10;
        int x = 0;
        do{
            System.out.println("Hello World 2nd");
            x++;
        }while (x < maxx);
        
    }
    
}
