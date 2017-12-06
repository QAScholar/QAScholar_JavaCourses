package Classwork;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02.12.2017.
 */
public class readfile {
    public static void main(String[] args) throws Exception {
        FileInputStream filestream=new FileInputStream("c:/test/2.txt");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(filestream));
        List<String> array=new ArrayList<>();

        while (bufferedReader.ready()){
            array.add(bufferedReader.readLine());
        }
       // System.out.println(bufferedReader.readLine());

        for (String s : array) {
            System.out.println(s);
        }
    }
}
