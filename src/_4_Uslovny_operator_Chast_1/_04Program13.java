package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//13.	Найти максимальное значение среди 4 переменных, используя тернарный оператор.
public class _04Program13 {
    public static void main(String[] args) {
        //Вводим числа
        System.out.println("Введите первое число:");
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        System.out.println("Введите второе число:");
        Scanner y=new Scanner(System.in);
        int Y=y.nextInt();
        System.out.println("Введите третье число:");
        Scanner z=new Scanner(System.in);
        int Z=z.nextInt();
        System.out.println("Введите четвертое число:");
        Scanner a=new Scanner(System.in);
        int A=a.nextInt();
        System.out.print("Наименьшее из этих чисел- ");
        System.out.println((X<Y&X<Z&X<A)?X:(Y<Z&Y<X&Y<X)?Y:(Z<A&Z<X&Z<Y)?Z:A);
    }
}
