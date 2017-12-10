package _4_Uslovny_operator_Chast_1;

import java.util.Scanner;

//5.	Ввести с клавиатуры символ. Определить, чем он является: цифрой, буквой или знаком пунктуации.
public class _04Program05 {
    public static void main(String[] args) {
        System.out.println("Enter character: ");
        Scanner a=new Scanner(System.in);
//char x=a.next();
          char x=a.nextLine().toCharArray()[0];
        boolean checkdig=Character.isDigit(x);
        boolean checklet=Character.isLetter(x);
        if(checkdig){
            System.out.println("This character is a digit");
        }
        else if (checklet){
            System.out.println("This character is a letter");
        }
        else {
            System.out.println("This character is a punctuation symbol");
        }
   }

}
