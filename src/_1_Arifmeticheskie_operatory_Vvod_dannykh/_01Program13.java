package _1_Arifmeticheskie_operatory_Vvod_dannykh;
//13.	Поменять местами значения переменных a и b, сначала с использованием дополнительной третьей переменной, а затем – без.
import java.util.Scanner;

public class _01Program13 {
    public static void main(String[] args) {
        //с использованием дополнительной третьей переменной
        System.out.println("Enter x: ");
        Scanner a=new Scanner(System.in);
        double x=a.nextInt();
        System.out.println("Enter y: ");
        Scanner b=new Scanner(System.in);
        double y=b.nextInt();

        double z;
        z=x;
        x=y;
        y=z;
        System.out.println("After changing places value of x= "+x+ " and value of y= "+y);

        //без использования дополнительной третьей переменной
        System.out.println("Enter u: ");
        Scanner c=new Scanner(System.in);
        int u=c.nextInt();
        System.out.println("Enter i: ");
        Scanner d=new Scanner(System.in);
        int i=d.nextInt();

        u=u+i;
        i=i-u;
        i=-i;
        u=u-i;
        System.out.println("After changing places value of u= "+u+ " and value of i= "+i);
    }
}
