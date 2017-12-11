package _5_Uslovny_operator_Chast_2;

import java.util.Scanner;

//6.	Указать с клавиатуры пол и возраст человека. Определить, пора ли ему на пенсию.
public class _05Program06 {
    public static void main(String[] args) {
        //Вводим пол
        System.out.println("Введите ваш пол (М/Ж):");
        Scanner x=new Scanner(System.in);
        String X=x.nextLine();
        //Вводим возраст
        System.out.println("Введите ваш полный возраст:");
        Scanner y=new Scanner(System.in);
        int Y=y.nextInt();
        switch (X){
            case "М":
            if (Y>=60){
                System.out.println("Вам пора на пенсию!");
            }
            else {
                System.out.println("Вам придется еще поработать!");
            }
            break;
            case "Ж":
                if (Y>=55){
                    System.out.println("Вам пора на пенсию!");
                }
                else {
                    System.out.println("Вам придется еще поработать!");
                }
                break;
                default:
                    System.out.println("Некорректно указан пол");
        }

    }
}
