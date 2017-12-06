package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;

import java.util.Scanner;

//9.	Ввести пятизначное число и сдвинуть его циклически вправо на N разрядов
// (например, ввести число 12345, и 2 разряда – получить и вывести на экран 45123).
public class _02Program09 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Введите пятизначное число: ");
        int x=a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.println("Введите количество разрядов: ");
        int N=b.nextInt();
        //Вводим временные переменные, для дальнейшего перевода чисел в строки и их конкатенации
        //n0- это левая часть числа, которая сдвигается вправо
        int n0;
        //n2- это правая часть числа, которая переносится в начало числа
        int n2;
        //Возможно всего 4 разряда, при которых программа будет давать корректные результат;
        // реализовано через цикл, в зависимости от введеного числа разрадов N
        if (N==1) {
            n0 = x / 10;
            n2 = x % 10;
            String s2 = String.valueOf(n2);
            String S = String.valueOf(n0);
            System.out.println(s2 + S);
        }
        else if (N==2) {
            n0 = x / 100;
            n2 = x % 100;
            String s2 = String.valueOf(n2);
            String S = String.valueOf(n0);
            System.out.println(s2 + S);
        }
        else if (N==3){
            n0=x/1000;
            n2=x%1000;
            String s2=String.valueOf(n2);
            String S=String.valueOf(n0);
            System.out.println(s2+S);
        }
        else if (N==4){
            n0=x/10000;
            n2=x%10000;
            String s2=String.valueOf(n2);
            String S=String.valueOf(n0);
            System.out.println(s2+S);
        }
        else {
            System.out.println("Программа не будет работать корректно с данным разрядом");
        }
    }
}
