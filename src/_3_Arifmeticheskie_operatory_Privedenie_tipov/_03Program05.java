package _3_Arifmeticheskie_operatory_Privedenie_tipov;

import java.util.Scanner;

//5.	Пользователь вводит с клавиатуры время в секундах.
// Перевести это значение в дни, часы, минуты и секунды.
// Например, 43512 секунд – это 12 часов, 5 минут и 12 секунд.
public class _03Program05 {
    public static void main(String[] args) {
        System.out.println("Введите время, сек: ");
        Scanner a=new Scanner(System.in);
        double T=a.nextDouble();
        //Находим время в минутах и секундах

        double hour=T/3600;
       int HourFinal=(int)hour;
        System.out.println(HourFinal);

        double minsek=(hour-HourFinal)*60;
        int MinFinal=(int)minsek;
        System.out.println(MinFinal);

        double sek=(minsek-MinFinal)*60;
        int SekFinal=(int)sek;
        System.out.println(sek);


    }
}
