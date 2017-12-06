package _2_Arifmeticheskie_operatory_Delenie_po_modulyu;
//10.	Рассчитать общую массу всех планет Солнечной системы.
// Вычислить среднее арифметическое масс планет. Затем - массу каждой планеты в процентном соотношении,
// если принять за 100% общую массу всех планет.
// Во сколько раз масса самой крупной планеты больше чем сумма масс всех остальных планет?
// Все результаты – показать на экране.
public class _02Program10 {
    public static void main(String[] args) {
        //Все массы нужно умножить на 10 в 24 степени, но для удобства, эта 10 убрана
        double merc=0.32868;
        double venus=4.81068;
        double earth=5.97600;
        double mars=0.63345;
        double jup=1876.64328;
        double sat=561.80376;
        double uran=86.05440;
        double nept=101.59200;
        double plut=0.01195;

        //Общая масса
        double M=merc+venus+earth+mars+jup+sat+uran+nept+plut;
        System.out.println("Общая масса всех планет солнечно системы= "+M+" *10 в 24 степени");
        System.out.println();
        //Массы планет в процентном соотношении
        double mercM=merc/M*100;
        System.out.println("Масса Меркурия в процентном соотношении от общей массы всех планет солнечной системы составляет: "+mercM);
        double venusM=venus/M*100;
        System.out.println("Масса Венеры в процентном соотношении от общей массы всех планет солнечной системы составляет: "+venusM);
        double earthM=earth/M*100;
        System.out.println("Масса Земли в процентном соотношении от общей массы всех планет солнечной системы составляет: "+earthM);
        double marsM=mars/M*100;
        System.out.println("Масса Марса в процентном соотношении от общей массы всех планет солнечной системы составляет: "+marsM);
        double jupM=jup/M*100;
        System.out.println("Масса Юпитера в процентном соотношении от общей массы всех планет солнечной системы составляет: "+jupM);
        double satM=sat/M*100;
        System.out.println("Масса Сатурна в процентном соотношении от общей массы всех планет солнечной системы составляет: "+satM);
        double uranM=uran/M*100;
        System.out.println("Масса Урана в процентном соотношении от общей массы всех планет солнечной системы составляет: "+uranM);
        double neptM=nept/M*100;
        System.out.println("Масса Нептуна в процентном соотношении от общей массы всех планет солнечной системы составляет: "+neptM);
        double plutM=plut/M*100;
        System.out.println("Масса Плутона в процентном соотношении от общей массы всех планет солнечной системы составляет: "+plutM);
        System.out.println();
        //Масса всех планет без Юпитера
        double bezJup=merc+venus+earth+mars+sat+uran+nept+plut;
        //Во сколько раз масса Юпитера больше масс всех остальных планет вместе взятых
        System.out.println("Масса Юпитера больше масс всех остальных планет вместе взятых в "+(jup/bezJup)+" раз");
    }
}