package Classwork;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Demo03Serial {
    public static void main(String[] args) throws Exception {



        //try{
        FileInputStream fileInputStream = new FileInputStream(  "C://Java/QAScholar_JavaCourses//questions.txt");

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(fileInputStream));

        List<String> array=new ArrayList<>();

        while (bufferedReader.ready());
        array.add(bufferedReader.readLine());

        for (String s:array) {
            System.out.println(s);
        }
        }


//        int i=0;
//        while((i=fileInputStream.read())!=-1){
//            System.out.print((char)i);
//        }
//        fileInputStream.close();


        //}catch(Exception e){System.out.println(e);}

////        CarSaveLoad carSaveLoad1 = new CarSaveLoad();
////        carSaveLoad1.load(fileInputStream);
//
//      System.out.println(carSaveLoad1.getName());
//
//        fileInputStream.close();
   }


