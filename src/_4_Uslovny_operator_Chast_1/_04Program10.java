package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//Вводится целое число (не более 4 разрядов!). Определить количество цифр в нём.
public class _04Program10 {
    public static void main(String[] args) {
        //Вводим число
        System.out.println("Введите число (не более четырех разрядов!):");
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        if (X/10000>0){
            System.out.println("Вы ввели слишком большое число!");
        }
        else if (X/1000>0){
            System.out.println("В введенном числе "+X+"- 4 цифры ");
        }
        else if (X/100>0){
            System.out.println("В введенном числе "+X+"- 3 цифры ");
        }
        else if (X/10>0){
            System.out.println("В введенном числе "+X+"- 2 цифры ");
        }
        else if (X/1>0){
            System.out.println("В введенном числе "+X+"- 1 цифра ");
        }
    }
}
