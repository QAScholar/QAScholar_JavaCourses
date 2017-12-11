package _5_Uslovny_operator_Chast_2;

import java.util.Scanner;

//10.	Написать программу, которая предлагает пользователю выбрать животное из списка
// (1 – кошка, 2 – собака и тд.), и в ответ показывает, какие звуки издаёт выбранное животное.
// В списке должно быть хотя бы 10 животных.
public class _05Program10 {
    public static void main(String[] args) {
        //Выводим список животных
        System.out.println("Выберите животное из списка (введите цифру):");
        System.out.println("1- кошка");
        System.out.println("2- собака");
        System.out.println("3- попугай");
        System.out.println("4- мышка");
        System.out.println("5- корова");
        System.out.println("6- курица");
        System.out.println("7- ворона");
        System.out.println("8- коза");
        System.out.println("9- сова");
        System.out.println("10- змея");
        //Вводим цифру
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();

        switch (X){
            case 1:
                System.out.println("Мяу!");
                break;
            case 2:
                System.out.println("Гав!");
                break;
            case 3:
                System.out.println("Чик-чирик!");
                break;
            case 4:
                System.out.println("Пи-пи-пи!");
                break;
            case 5:
                System.out.println("Мууу!");
                break;
            case 6:
                System.out.println("Кудах-тах-тах!");
                break;
            case 7:
                System.out.println("Кар!");
                break;
            case 8:
                System.out.println("Беее!");
                break;
            case 9:
                System.out.println("У-ху!");
                break;
            case 10:
                System.out.println("<шипит>");
                break;
            default:
                System.out.println("Нет такого животоного в базе данных!");
        }

    }
}
