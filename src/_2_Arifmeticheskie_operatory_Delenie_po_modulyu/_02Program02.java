package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;

import java.util.Scanner;

//2.	Ввести 4-значное число и подсчитать сумму первой и третьей цифры и разность второй и четвертой цифры.
public class _02Program02 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int x=a.nextInt();
        //Находим первую цифру
        int n1=x/1000;
        System.out.println("Первая цифра равна "+ n1);
        //Находим вторую цифру
        int n2=(x/100)%10;
        System.out.println("Вторая цифра равна "+n2);
        //Находим третью цифру
        int n3=(x/10)%10;
        System.out.println("Третья цифра равна "+n3);
        //Находим четвертую цифру
        int n4=x%10;
        System.out.println("Четвертая цифра равна "+n4);
        //Вычисляем сумму первой и третьей
        System.out.println("Сумма первой и третьей цифр равна "+(n1+n3));
        //Вычисляем разность второй и четвертой
        System.out.println("Разность второй и четвертой цифр равна "+(n2-n4));
    }
}
