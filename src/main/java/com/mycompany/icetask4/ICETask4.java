package com.mycompany.icetask4;
import java.util.Scanner;
/**
 *
 * @author ST10264122 Mivuyo Mahangu
 */
public class ICETask4 {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
