package joo.de.java.clip9;

import sun.security.krb5.internal.SeqNumber;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 90){
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
