package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Set<Integer> courseA = new HashSet<>();

        System.out.print("How many students for course A ?: ");
        int quantA = sc.nextInt();

        for (int i = 0; i < quantA; i++) {
            int code = sc.nextInt();
            courseA.add(code);
        }

        Set<Integer> courseB = new HashSet<>();

        System.out.print("How many students for course B ?: ");
        int quantB = sc.nextInt();

        for (int i = 0; i < quantB; i++) {
            int code = sc.nextInt();
            courseB.add(code);
        }

        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course C ?: ");
        int quantC = sc.nextInt();

        for (int i = 0; i < quantC; i++) {
            int code = sc.nextInt();
            courseC.add(code);
        }


        Set<Integer> total = new HashSet<>(courseA);
        total.addAll(courseB);
        total.addAll(courseC);

        System.out.println("Total Students: " + total.size());


    }
}