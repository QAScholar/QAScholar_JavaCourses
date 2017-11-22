package _4_Uslovny_operator_Chast_1;


import java.util.Scanner;

//4.	Реализовать калькулятор
public class _04Program04 {
    public static void main(String[] args) {

        //Вводим а
        System.out.println("Enter a: ");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        //Вводим b
        System.out.println("Enter b: ");
        Scanner y=new Scanner(System.in);
        int b=y.nextInt();
        //Показываем юзеру доступные арифметические действия
        System.out.println("You can choose the following operations: ");
        System.out.println("1) a+b");
        System.out.println("2) a-b");
        System.out.println("3) a*b");
        System.out.println("4) a/b");
        System.out.println("5) a%b");
        //Считаем
        int add=a+b;
        int ded=a-b;
        int mult=a*b;
        float div=a/b;
        int mod=a%b;
        //Юзер должен ввести с клавиатуры № действия чтобы получить ответ
        System.out.println("Enter № of operation: ");
        //Новая переменная для № действия
        Scanner number=new Scanner(System.in);
        int selection=number.nextInt();
        //Через свич выбирается подходящее действие
        switch (selection) {
            case 1:
                System.out.println("The result of addition is: "+add);
                 break;
            case 2:
                System.out.println("The result of deduction is: "+ded);
                break;
            case 3:
                System.out.println("The result of multiplication is: "+mult);
                break;
            case 4:

                if (b==0){
                    System.out.println("You cannot divide by 0!");
                } else {
                System.out.println("The result of division is: "+div);}
                break;
            case 5:
                System.out.println("The result of modulus is: "+mod);
                break;
        default:
            System.out.println("Wrong selection");
        }
    }
}
