package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//6.	Ввести с клавиатуры число и проверить, принадлежит ли это число диапазону от N до M (включительно).
public class _04Program06 {
    public static void main(String[] args) {
        //Вводим N
        System.out.println("Введите N:");
        Scanner x=new Scanner(System.in);
        int N=x.nextInt();
        //Вводим M
        System.out.println("Введите M:");
        Scanner y=new Scanner(System.in);
        int M=y.nextInt();
        if (N>M){
            System.out.println("Неверный диапазон. M должно быть больше чем N");
        }
        else {
            //Вводим число
            System.out.println("Введите число:");
            Scanner z=new Scanner(System.in);
            int digit=z.nextInt();
            if (digit>=N &digit<=M){
                System.out.println("Введенное число "+digit+" принадлежит диапазону от "+N+ " до "+M);
            }
            else {
                System.out.println("Введенное число "+digit+" не принадлежит диапазону от "+N+ " до "+M);
            }
        }
    }
}
