package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//1.	Ввести число, и определить – чётное оно, или нет.
public class _04Program01 {
    public static void main(String[] args) {
       //Вводим число
        System.out.println("Enter a number: ");
        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
        //Определяем четное или нет
        if (x%2==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
