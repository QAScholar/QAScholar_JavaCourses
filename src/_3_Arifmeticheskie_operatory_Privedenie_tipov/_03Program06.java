package _3_Arifmeticheskie_operatory_Privedenie_tipov;

import java.util.Scanner;

//6.	Пользователь вводит с клавиатуры расстояние до аэропорта
// (в километрах, может быть вещественное значение) и время, за которое нужно доехать (в минутах).
// Вычислить скорость (км/ч), с которой нужно ехать.
public class _03Program06 {
    public static void main(String[] args) {
        //Вводим расстояние
        System.out.println("Введите расстояние, км: ");
        Scanner a=new Scanner(System.in);
        double S=a.nextInt();
        //Вводим скорость
        System.out.println("Введите время, мин: ");
        Scanner b=new Scanner(System.in);
        double T=b.nextDouble();
        double V=S/(T/60);
        System.out.println("Вы должны ехать со скоростью: "+V+" км/ч");
    }
}
