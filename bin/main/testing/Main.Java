package testing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        System.out.println( "insert a number");
 
 
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(j+1);
            }
            System.out.println();
            System.out.println("number "+i+" is done");
        }
 

    }
}
