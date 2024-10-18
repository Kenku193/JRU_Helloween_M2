package level08_staticAndConstructors.example1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(Child.s);

    }
}

// 0. Bootstrap Classloader
// 1. Platform Classloader
// 2. App Classloader

// ClassNotFound
// ClassNotDefined