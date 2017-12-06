package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;

//4.	Написать программу, которая предлагает пользователю ввести сумму денежного вклада в рублях,
// а также процент годовых, которые выплачивает банк.
// Определить сумму денег, выплачиваемых банком вкладчику каждый месяц.
import java.util.Scanner;

public class _02Program04 {
    public static void main(String[] args) {
        System.out.println("Введите сумму денежного вклада x: ");
        Scanner a=new Scanner(System.in);
        double x=a.nextInt();
        System.out.println("Введите процент годовых y: ");
        Scanner b=new Scanner(System.in);
        double y=b.nextInt();
        //Вычисляем сумму выплачиваемую банком каждый месяц
        double s=(x*y/100)/12;
        System.out.println("Банк выплачивает вкладчику "+s+ " рублей каждый месяц");
        //Сколько денег получит вкладчик через год
        double s2=x+s*12;
        System.out.println("Через год вкладчик получит "+s2+" рублей");
    }
}
