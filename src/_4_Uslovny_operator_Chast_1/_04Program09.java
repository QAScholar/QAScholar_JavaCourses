package _4_Uslovny_operator_Chast_1;
//9.	Показать модуль введённого числа.
import java.util.Scanner;

public class _04Program09 {
    public static void main(String[] args) {
        //Вводим число
        System.out.println("Введите число:");
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        if (X<0){
            System.out.println("Модуль введенного числа "+X+ " равен " + X*(-1));
        }
        else {
            System.out.println("Модуль введенного числа "+X+ " равен " + X);
        }
    }
}
