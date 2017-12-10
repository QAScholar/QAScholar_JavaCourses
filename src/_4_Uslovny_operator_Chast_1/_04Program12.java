package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//12.	Пользователь задаёт координаты верхнего левого, и нижнего правого угла прямоугольника,
// а также координаты точки (X,Y) в декартовой системе координат.
// Принадлежит ли точка этому прямоугольнику?
public class _04Program12 {
    public static void main(String[] args) {

    //Вводим координаты верхнего левого
    System.out.println("Введите координаты верхнего левого угла прямоугольника:");
    System.out.println("Введите X1: ");
    Scanner x1=new Scanner(System.in);
    int X1=x1.nextInt();
    System.out.println("Введите Y1: ");
    Scanner y1=new Scanner(System.in);
    int Y1=y1.nextInt();
        //Вводим координаты нижнего правого
        System.out.println("Введите координаты нижнего правого угла прямоугольника:");
        System.out.println("Введите X2: ");
        Scanner x2=new Scanner(System.in);
        int X2=x2.nextInt();
        System.out.println("Введите Y2: ");
        Scanner y2=new Scanner(System.in);
        int Y2=y2.nextInt();
        //Вводим координаты точки
        System.out.println("Введите координаты точки:");
        System.out.println("Введите X: ");
        Scanner x3=new Scanner(System.in);
        int X3=x3.nextInt();
        System.out.println("Введите Y: ");
        Scanner y3=new Scanner(System.in);
        int Y3=y3.nextInt();
        if ((X3>=X1 &X3<=X2)& (Y3>=Y2 &Y3<=Y1)){
            System.out.println("Точка "+X3+":"+Y3+"+ принадлежит данному прямоугольнику");
        }
        else{
            System.out.println("Точка "+X3+":"+Y3+" не принадлежит данному прямоугольнику");
        }

}
}