package _5_Uslovny_operator_Chast_2;
//1.	Определить, параллельна ли определённая прямая линия оси ординат, либо оси абсцисс. Прямая задаётся двумя точками.
import java.util.Scanner;

public class _05Program01 {
    public static void main(String[] args) {
        //Вводим координаты
        System.out.println("Введите координату X первой точки");
        Scanner x1=new Scanner(System.in);
        int X1=x1.nextInt();
        System.out.println("Введите координату Y первой точки");
        Scanner y1=new Scanner(System.in);
        int Y1=y1.nextInt();
        System.out.println("Введите координату X второй точки");
        Scanner x2=new Scanner(System.in);
        int X2=x2.nextInt();
        System.out.println("Введите координату Y второй точки");
        Scanner y2=new Scanner(System.in);
        int Y2=y2.nextInt();
        if (Y1==Y2){
            System.out.println("Введенная прямая параллельна оси абсцисс");
        }
        else if (X1==X2){
            System.out.println("Введенная прямая параллельна оси ординат");
        }
        else {
            System.out.println("Введенная прямая не параллельна ни одной оси");
        }
    }
}
