package Interface_testing_system;

import java.util.Scanner;

public class MainApp extends questions implements testing_system {
    public static void main(String[] args) {

        MainApp b=new MainApp();
        b.askquestion();
        //System.out.println("What is Java?");
        System.out.println();
        System.out.println("Answer 1: A programming language");
        System.out.println("Answer 2: A philosophical concept");
        System.out.println("Answer 3: An italian dish");

        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        if (x==1) {
            System.out.println("Correct");
        }
        else System.out.println("Wrong");

    }
}

