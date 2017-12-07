package _3_Arifmeticheskie_operatory_Privedenie_tipov;

import java.util.Scanner;

//1.	Марафонец прошел S километров со скоростью V метров в секунду (расстояние и скорость вводятся с клавиатуры).
// Определить, сколько времени он был в пути (часов, минут, секунд)?
public class _03Program01 {
    public static void main(String[] args) {
        //Вводим расстояние
        System.out.println("Введите расстояние, км: ");
        Scanner a=new Scanner(System.in);
        double S=a.nextInt();
        //Вводим скорость
        System.out.println("Введите скорость, м/с: ");
        Scanner b=new Scanner(System.in);
        double V=b.nextInt();
        //Переводим м в км

        double T=S/(V*3.6);
        System.out.println("Марафонец прошел "+S+" км за "+T+" часов или за "+T*60+" минут или за "+T*3600+" секунд");
    }
}
