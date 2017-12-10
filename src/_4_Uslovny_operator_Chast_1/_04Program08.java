package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//8.	Ввести число и определить кратно ли оно 3, 5, и 7 одновременно.
public class _04Program08 {
    public static void main(String[] args) {
        //Вводим число
        System.out.println("Введите число:");
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        if (X%3==0 &X%5==0 &X%7==0){
            System.out.println("Введенное число "+X+ " кратно 3 5 и 7 одновременно");
        }
        else {
            System.out.println("Введенное число "+X+ " не кратно 3 5 и 7 одновременно");
        }
    }
}
