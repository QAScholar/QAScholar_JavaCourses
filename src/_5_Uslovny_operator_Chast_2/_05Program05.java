package _5_Uslovny_operator_Chast_2;

import java.util.Scanner;

//5.	Ввести с клавиатуры шестизначный номер трамвайного (троллейбусного) билета,
// и определить является ли он счастливым (совпадают суммы трёх первых и трёх последних цифр билета).
public class _05Program05 {
    public static void main(String[] args) {
        //Вводим номер трамвайного билета
        System.out.println("Введите номер трамвайного билета:");
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        //Вычисляем цифры билета
        int x1=X/100000;
        int x2=X/10000%10;
        int x3=X/1000%10;
        int x4=X/100%10;
        int x5=X/10%10;
        int x6=X/1%10;
        if (x1+x2+x3==x4+x5+x6) {
            System.out.println("Билет счастливый!");
        }
        else {
            System.out.println("Вам повезет в другой раз");
        }
    }
}
