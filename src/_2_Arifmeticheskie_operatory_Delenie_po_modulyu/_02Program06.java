package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;

//6.	Написать программу, которая переводит фунты в килограммы.
// Один фунт – 405.9 грамма задается в программе как константа.
// Затем, реализовать обратный перевод – из килограммов в фунты.



import java.util.Scanner;

public class _02Program06 {
    public static void main(String[] args) {
        final double f=405.9;
        //Вводим килограммы
        System.out.println("Введите количество килограмм: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        double a=(x*1000)/f;
        System.out.println("В "+x+" килограмм- "+a+ " фунтов");
        System.out.println("А в "+a+ " фунтов- "+x+" килограмм");
    }
}
