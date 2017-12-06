package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;
//7.	Ввести длину, ширину и высоту комнаты.
// Подсчитать, сколько краски уйдет на покраску стен этой комнаты,
// если на 1м2 стены приходится N литров краски и M% поверхности стен занимают окна и двери.
// Также, рассчитать общую стоимость краски, с учётом того, что один литр краски стоит R рублей.

import java.util.Scanner;

public class _02Program07 {
    public static void main(String[] args) {
        //Вводим длину комнаты
        System.out.println("Введите длину комнаты:");
        Scanner a=new Scanner(System.in);
        double x=a.nextInt();
        //Вводим ширину комнаты
        System.out.println("Введите ширину комнаты:");
        Scanner b=new Scanner(System.in);
        double y=b.nextInt();
        //Вводим высоту комнаты
        System.out.println("Введите высоту комнаты:");
        Scanner c=new Scanner(System.in);
        double z=c.nextInt();
        //Вводим окна и двери
        System.out.println("Введите процент поверхности стен, занятый окнами и дверями:");
        Scanner d=new Scanner(System.in);
        double M=d.nextInt();

        //Рассчитываем площадь стен с окнами и дверями
        double S=((2*x+2*y)*z)-((2*x+2*y)*z)*M/100;
        System.out.println("Площадь стен с окнами и дверями= "+S+" м2");

        //Вводим количество литров краски на 1м2
        System.out.println("Введите количество литров краски, необходимое для покраски 1м2 стены:");
        Scanner e=new Scanner(System.in);
        double N=e.nextInt();
        //Считаем сколько краски уйдет на покраску стен комнаты
        System.out.println("Для того чтобы покрасить стены комнаты площадью "+S+" м2, потребуется "+N*S+" литров краски");
        //Вводим стоимость 1 литра краски
        System.out.println("Введите стоимость 1 литра краски в рублях:");
        Scanner f=new Scanner(System.in);
        double R=f.nextInt();
        System.out.println("Общая стоимость краски, необходимой для покраски стен комнаты равна "+N*S*R+" рублей");


    }
}
