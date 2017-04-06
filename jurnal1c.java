/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication2 {
 Scanner scan;
    int a1, b1, c1, a2, b2, c2, limit, i;
    public JavaApplication2() {
        scan = new Scanner(System.in);
        a1 = c1 = 1;
        b1 = a2 = b2 = c2 = limit = i = 0;
    }
    public void input() {
        try {
            System.out.printf("Enter limit: ");
            limit = scan.nextInt();
            scan.close();
        } catch (InputMismatchException | NumberFormatException e) {
            System.err.println("Error Occurred!");
            System.exit(0);
        }
    }
    public void compute() {
        for (; i < limit; i++) {
            a1 = b1;
            b1 = c1;
            c1 = a1 + b1;
            a2 = c1;
            c2 = b1;
        }
        System.out.println("deret terbalik fibonacci:");
        System.out.println(a2 + "\n" + c2);
        for (i = limit - 1; i >= 0; i--) {
            b2 = a2;
            a2 = c2;
            c2 = b2 - a2;
            System.out.println(c2);
        }
    }
    public static void main(String[] args) {
        JavaApplication2 fr = new JavaApplication2();
        fr.input();
        fr.compute();
    }
    }
    
    

