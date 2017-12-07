package _3_Arifmeticheskie_operatory_Privedenie_tipov;

import java.util.Scanner;

//4.	Пользователь вводит с клавиатуры массу в тоннах (дробное число).
// Вывести по отдельности количество тонн, килограмм, грамм
// (например, ввести 126.456789т - получить и вывести 126т 456кг 789г)
public class _03Program04 {
    public static void main(String[] args) {
        //Вводим массу
        System.out.println("Введите массу в тоннах (дробное число): ");
        Scanner a=new Scanner(System.in);
        double x=a.nextDouble();
        int tn=(int)x;
        //Находим килограммы с граммами
        double kg=x-tn;
        double kggr=kg*1000;
        //Находим килограммы без граммов
        int kgbezgr=(int)kggr;
        //Находим граммы
        double gr=kggr-kgbezgr;


        System.out.println("Вы ввели "+tn+" тонн "+kg+" килограмм "+gr+" грамм");
    }

}
