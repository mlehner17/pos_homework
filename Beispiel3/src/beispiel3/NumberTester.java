/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lehne
 */
public class NumberTester
{

    String fileName;
    static FileReader fileReader;
    static BufferedReader fileStream;
    static String Zeile;
    List<String> arL = new ArrayList<>();
    String[] ar;

    public interface NumberTest
    {

        boolean testNumber(int number);
    }

    public NumberTester(String fileName)
    {
        this.fileName = fileName;
    }

    public void trimFile()
    {
        File file = new File(fileName);
        if (file.exists())
        {
            try
            {
                fileReader = new FileReader(file);
            } catch (FileNotFoundException e)
            {
                System.out.println("Datei könnte nicht geöffnet werden.");
                e.printStackTrace();
                System.exit(0);
            }
            fileStream = new BufferedReader(fileReader);
            try
            {
                Zeile = fileStream.readLine();
                while (Zeile != null)
                {
                    arL.add(Zeile);
                    Zeile = fileStream.readLine();
                }
            } catch (IOException e)
            {
                System.out.println("Datei kann nicht gelesen werden.");
                e.printStackTrace();
            }

        } else
        {
            System.out.println("Datei wurde nicht gefunden.");
        }

        for (int i = 1; i < arL.size()-1; i++)
        {
            ar = arL.get(i).split(" ");
            int bob = Integer.parseInt(ar[0]);
            int bob2 = Integer.parseInt(ar[1]);
            if (bob == 1)
            {
                if (bob2 % 2 == 0)
                {
                    System.out.println("Gerade");
                } else
                {
                    System.out.println("Ungerade");
                }
            } else if (bob == 2)
            {
                if (bob2 < 2)
                {
                    System.out.println("Keine Primzahl");;
                } else
                {
                    for (int y = 2; y < bob2; y++)
                    {
                        if (bob2 % y == 0)
                        {
                            System.out.println("Keine Primzahl");;
                        }
                    }
                }
                System.out.println("Primzahl");;
            } else if (bob == 3)
            {
                String str = "" + bob2;
                String result = "";
                for (int x = str.length() - 1; x >= 0; x--)
                {
                    result += str.charAt(i);
                }

                if (result.equals(str))
                {
                    System.out.println("Palindrom");
                } else
                {
                    System.out.println("Kein Palindrom");
                }
            }
        }
    }

//    public boolean isPrime(int p) 
//    {
//        if (p < 2) {
//    return false;
//        } else {
//        for (int i = 2; i < p; i++) {
//        if (p % i == 0) {
//        return false;
//    }
//    }
//    }
//        return true;
//    }
    public void setOddEvenTester(NumberTest oddTester)
    {

    }

    public void setPrimeTester(NumberTest primeTester)
    {

    }

    public void setPalindromeTester(NumberTest palindromeTester)
    {

    }

    public void testFile()
    {

    }

}
