package _3_Arifmeticheskie_operatory_Privedenie_tipov;

import java.util.Scanner;

//3.	Пользователь вводит с клавиатуры сумму в рублях (дробное число).
// Вывести по отдельности количество рублей и количество копеек
// (например, ввести 45.67 рублей - получить и вывести 45 рублей 67 копеек)
public class _03Program03 {
    public static void main(String[] args) {
        //Вводим сумму
        System.out.println("Введите сумму в рублях (дробное число): ");
        Scanner a=new Scanner(System.in);
        double x=a.nextDouble();

        int y=(int)x;
        double d=x-y;
        System.out.println("Вы ввели "+y+" рублей и "+d+" копеек");
    }
}
