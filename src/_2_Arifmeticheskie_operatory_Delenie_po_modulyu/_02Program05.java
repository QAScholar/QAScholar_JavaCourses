package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;

import java.util.Scanner;

//5.	Сколько товара ценой Y можно купить на Х рублей и сколько получить сдачи?
public class _02Program05 {
    public static void main(String[] args) {
        //Вводим цену товара
        System.out.println("Введите цену на одну единицу товара:");
        Scanner a=new Scanner(System.in);
        int y=a.nextInt();
       //Вводим количество денег
        System.out.println("Введите сумму денег:");
        Scanner b=new Scanner(System.in);
        int x=b.nextInt();
        int k=x;
        System.out.println("На сумму " +y+ " рублей можно купить "+ x/y+ " единиц(ы) товара и получить "+ x%y+ " рублей сдачи");
    }
}
