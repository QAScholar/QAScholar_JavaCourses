package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;

import java.util.Scanner;

//3.	Ввести с клавиатуры 3-значное число и удалить из него среднюю цифру
// (например, ввести 3, 5, 7 – получить и вывести число 37).
public class _02Program03 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int x=a.nextInt();
        //Находим первую цифру
        int n1=x/100;
        //Находим третью цифру
        int n3=x%10;
        //Переводим первую цифру в строку
        String s1=String.valueOf(n1);
        //Переводим третью цифру в строку
        String s3=String.valueOf(n3);
        //Складываем строки
        System.out.println("Число с удаленной средней цифрой"+s1+s3);
    }
}
