package _5_Uslovny_operator_Chast_2;

import java.util.Scanner;

//2.	Проверить, имеет ли введённое число вещественную часть.
// Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5 и 10.0 – нет.
public class _05Program02 {
    public static void main(String[] args) {
        //Вводим число
        System.out.println("Введите число");
        Scanner x=new Scanner(System.in);
        double X=x.nextDouble();
        if (X%1!=0){
            System.out.println("Введенное число имеет вещественную часть "+(X%1));
        }
        else {
            System.out.println("Введенное число не имеет вещественную часть");
        }
    }
}
