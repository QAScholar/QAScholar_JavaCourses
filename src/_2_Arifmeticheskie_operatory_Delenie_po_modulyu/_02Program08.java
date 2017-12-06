package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;
//8.	Ввести с клавиатуры 3-значное число и «перевернуть» его (например, ввести 357 – получить и вывести 753).
import java.util.Scanner;

public class _02Program08 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int x=a.nextInt();
        //Находим первую цифру
        int n1=x/100;
        //Находим вторую цифру
        int n2=x/10%10;
        //Находим третью цифру
        int n3=x%10;
        //Переводим первую цифру в строку
        String s1=String.valueOf(n1);
        //Переводим первую цифру в строку
        String s2=String.valueOf(n2);
        //Переводим третью цифру в строку
        String s3=String.valueOf(n3);
        //Складываем строки
        System.out.println("Перевернутое число= "+s3+s2+s1);
    }
}
