package testing;

import java.util.Scanner;


public class AppTest {
    public static void main(String[] args) {
        Shirt favShirt = new Shirt("large", 10.75, true);
    Scanner input = new Scanner(System.in);

    System.out.println("Favorite Shirt: Original");
    System.out.println("Shirt Size: " + favShirt.getPrice());
    System.out.println("Shirt Price: " + favShirt.getPrice());
    System.out.println("Shirt Has Buttons: " + favShirt.getHasButtons());

    System.out.println("--------------------");

    favShirt.setSize("small");
    favShirt.setHasButtons(false);

    System.out.println("Favorite Shirt: Updated");
    System.out.println("Shirt Size: " + favShirt.getPrice());
    System.out.println("Shirt Price: " + favShirt.getPrice());
    System.out.println("Shirt Has Buttons: " + favShirt.getHasButtons());
    }
}
