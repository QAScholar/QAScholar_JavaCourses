package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//7.	Написать программу для проверки кратности числа X числу Y (оба числа вводятся с клавиатуры).
public class _04Program07 {
    public static void main(String[] args) {
        //Вводим X
        System.out.println("Введите X:");
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        //Вводим Y
        System.out.println("Введите Y:");
        Scanner y=new Scanner(System.in);
        int Y=y.nextInt();
        if (X%Y==0){
            System.out.println("Число "+X+ " кратно числу "+Y);
        }
        else {
            System.out.println("Число "+X+ " не кратно числу "+Y);
        }
    }
}
