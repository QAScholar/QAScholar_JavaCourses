package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//11.	Ввести с клавиатуры пятизначное число и определить, является ли оно палиндромом
// (т.е. одинаково читается в обоих направлениях - например, 12321 будет палиндромом, а 12345 – не палиндром).
public class _04Program11 {
    public static void main(String[] args) {
        //Вводим число
        System.out.println("Введите пятизначное число:");
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        //Проверяем число на пятизначность
        if (X/100000>0){
            System.out.println("Вы ввели слишком большое число!");
        }
        else if (X/10000<1){
            System.out.println("Вы ввели слишком маленькое число!");
        }
        else {
        //Находим цифры числа
        int digit1=X/10000;
        int digit2=X/1000%10;
        //System.out.println(digit2);
        //Среднее число не меняется, ему проверка не нужна, находим сразу четвертое
        int digit4=X/10%10;
        //System.out.println(digit4);
        int digit5=X/1%10;
        //System.out.println(digit5);
        if (digit1==digit5&digit2==digit4){
            System.out.println("Введенное число "+X+ " является палиндромом");
        }
        else {
            System.out.println("Введенное число " + X + " не является палиндромом");
        }
        }
    }
}
