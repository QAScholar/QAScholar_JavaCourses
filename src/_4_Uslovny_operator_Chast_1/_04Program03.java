package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//3.	Ввести число, и выяснить - положительное оно, отрицательное, или равно нулю?
public class _04Program03 {
    public static void main(String[] args) {
        //Вводим число
        System.out.println("Введите число Х: ");
        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
       //Проверяем положительное ли
        if (x>0){
            System.out.println("X- число положительное");
        }
        //Если нет, то проверяем отрицательное ли
        else if (x<0){
            System.out.println("X- число отрицательное");
        }
        //Если не обе проверки не проходят, значит число отрицательное
        else {
            System.out.println("X равно 0");
        }
    }
}
