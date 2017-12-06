package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;

//1.	Ввести с клавиатуры два 3-значных числа и поменять у них средние цифры
// (например, ввести 357  и 702 – получить и вывести числа  307 и 752).
import java.util.Scanner;

public class _02Program01 {
    public static void main(String[] args) {

                 //Объявляем переменные для сканера и временные переменные
                int a, b,tempa,tempb;
                Scanner scan = new Scanner(System.in);
                //Вводим первую переменную
                System.out.println("Enter 1st number: ");
                a=scan.nextInt();
                //Вводим вторую переменную
                System.out.println("Enter 2nd number: ");
                b=scan.nextInt();
                tempa=a%100-a%10;
                tempb=b%100-b%10;
                a=a+(tempb-tempa);
                b=b+(tempa-tempb);
                System.out.println(a);
                System.out.println(b);
            }
        }



