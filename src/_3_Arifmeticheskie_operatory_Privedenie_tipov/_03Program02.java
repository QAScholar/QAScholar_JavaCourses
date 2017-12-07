package _3_Arifmeticheskie_operatory_Privedenie_tipov;

import java.util.Scanner;

//2.	Пользователь вводит с клавиатуры два дробных числа.  Вывести на экран сумму целых частей и сумму дробных.
public class _03Program02 {
    public static void main(String[] args) {
        //Вводим первое число
        System.out.println("Введите первое дробное число: ");
        Scanner a=new Scanner(System.in);
        double x=a.nextDouble();
        //Вводим второе число
        System.out.println("Введите второе дробное число: ");
        Scanner b=new Scanner(System.in);
        double y=b.nextDouble();

        //Нвходим дробные и целые части первого числа
        int iPartX;
        double fPartX;
        iPartX = (int) x;
        fPartX = x - iPartX;

        //Нвходим дробные и целые части второго числа
        int iPartY;
        double fPartY;
        iPartY = (int) y;
        fPartY = y - iPartY;

        System.out.println("Сумма целых частей равна "+(iPartX+iPartY));
        System.out.println("Сумма дробных частей равна "+(fPartX+fPartY));

    }
}
