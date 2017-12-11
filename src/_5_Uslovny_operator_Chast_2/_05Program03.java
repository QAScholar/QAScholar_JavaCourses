package _5_Uslovny_operator_Chast_2;
//3.	Написать программу, которая предлагает пользователю ввести номер дня недели,
// и в ответ показывает название этого дня (например, 6 – это суббота).
// Решить с использованием if и switch.

import java.util.Scanner;

public class _05Program03 {
    public static void main(String[] args) {
        //Вводим номер дня недели
        System.out.println("Введите номер дня недели:");
        Scanner x=new Scanner(System.in);
        int X=x.nextInt();
        //Череза if
//        if (X==1){
//            System.out.println("Этот день- понедельник");
//        }
//        else if (X==2){
//            System.out.println("Этот день- вторник");
//        }
//        else if (X==3){
//            System.out.println("Этот день- среда");
//        }
//        else if (X==4){
//            System.out.println("Этот день- четверг");
//        }
//        else if (X==5){
//            System.out.println("Этот день- пятница");
//        }
//        else if (X==6){
//            System.out.println("Этот день- суббота");
//        }
//        else if (X==7){
//            System.out.println("Этот день- воскресенье");
//        }
//        else{
//            System.out.println("Такого дня недели не бывает!");
//        }


        // Через switch
       switch (X){
           case 1:
               System.out.println("Этот день- понедельник");
               break;
           case 2:
               System.out.println("Этот день- вторник");
               break;
           case 3:
               System.out.println("Этот день- среда");
               break;
           case 4:
               System.out.println("Этот день- четверг");
               break;
           case 5:
               System.out.println("Этот день- пятница");
               break;
           case 6:
               System.out.println("Этот день- суббота");
               break;
           case 7:
               System.out.println("Этот день- воскресенье");
               break;
           default:
               System.out.println("Такого дня недели не бывает!");

        }
    }
}
