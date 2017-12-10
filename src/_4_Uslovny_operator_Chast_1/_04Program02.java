package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//2.	Ввести три числа и найти наименьшее среди них.
public class _04Program02 {
    public static void main(String[] args) {
        //Вводим первое число
        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
        //Вводим второе число
        Scanner b=new Scanner(System.in);
        int y=b.nextInt();
        //Вводим третье число
        Scanner c=new Scanner(System.in);
        int z=c.nextInt();
        if (x<y &x<z) {
            System.out.println("The smallest number is: " +x);
        }
        else if (y<x&y<z) {
            System.out.println("The smallest number is: " + y);
        }
        else {
            System.out.println("The smallest number is: " +z);
            }
        }

}
