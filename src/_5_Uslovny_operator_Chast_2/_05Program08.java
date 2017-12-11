package _5_Uslovny_operator_Chast_2;

import java.util.Scanner;

//8.	Программа подсчета идеального веса к росту.
// Ввести рост и вес, вывести сообщение о том, сколько  нужно кг набрать или сбросить (идеальный вес = рост - 110).
public class _05Program08 {
    public static void main(String[] args) {
        //Вводим рост
        System.out.println("Введите ваш рост:");
        Scanner x=new Scanner(System.in);
        double X=x.nextDouble();
        //Вводим вес
        System.out.println("Введите ваш вес:");
        Scanner y=new Scanner(System.in);
        double Y=y.nextDouble();
        if (Y==X-110){
            System.out.println("Соотношение вашего роста к весу- идеально!");
        }
        else if (Y>X-110) {
            System.out.println("Вам нужно сбросить "+(Y-(X-110))+" килограмм");
        }
        else {
            System.out.println("Вам нужно набрать "+((X-110)-Y)+" килограмм");
        }
    }
}
