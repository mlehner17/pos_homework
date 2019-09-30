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
    int bob;
    int bob2;

    public interface NumberTest
    {
        boolean testNumber(int number);
    }

    public NumberTester(String fileName)
    {
        this.fileName = fileName;
    }



    public void setOddEvenTester(/*NumberTest oddTester*/)
    {
//        if (bob2 % 2 == 0)
//                {
//                    System.out.println("Gerade");
//                } else
//                {
//                    System.out.println("Ungerade");
//                }
        NumberTest isEven = (n) -> (n % 2) == 0;
        if(isEven.testNumber(bob2)==true)
        {
            System.out.println("Gerade");
        }
        else 
        {
            System.out.println("Ungerade");
        }
        
    }

    public void setPrimeTester(/*NumberTest primeTester*/)
    {
//                if (bob2 < 2)
//                {
//                    System.out.println("Keine Primzahl");
//                } else if (bob2 % 2 == 0)
//                {
//                     System.out.println("Keine Primzahl"); 
//                }
//                else
//                {
//                    System.out.println("Primzahl");
//                }
        NumberTest isPrime = (n) -> ((n<2)||((n%2)==0));
        if (isPrime.testNumber(bob2)==true)
        {
            System.out.println("Keine Primzahl");
        }
        else
        {
            System.out.println("Primzahl");
        }
    }

    public void setPalindromeTester(/*NumberTest palindromeTester*/)
    {
//        String str = "" + bob2;
//                String result = "";
//                for (int x = str.length() - 1; x >= 0; x--)
//                {
//                    result += str.charAt(x);
//                }
//
//                if (result.equals(str))
//                {
//                    System.out.println("Palindrom");
//                } else
//                {
//                    System.out.println("Kein Palindrom");
//                }
        
        NumberTest isPalindrom = ((n) -> {
             String intStr = String.valueOf(n); 
            return intStr.equals(new StringBuilder(intStr).reverse().toString());
        });
        if(isPalindrom.testNumber(bob2)==true)
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Kein Palindrom");
        }
        
    }

    public void testFile()
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

        for (int i = 1; i < arL.size(); i++)
        {
            ar = arL.get(i).split(" ");
            bob = Integer.parseInt(ar[0]);
            bob2 = Integer.parseInt(ar[1]);
            if (bob == 1)
            {
//                if (bob2 % 2 == 0)
//                {
//                    System.out.println("Gerade");
//                } else
//                {
//                    System.out.println("Ungerade");
//                }
                 setOddEvenTester();
            } else if (bob == 2)
            {
//                if (bob2 < 2)
//                {
//                    System.out.println("Keine Primzahl");
//                } else if (bob2 % 2 == 0)
//                {
//                     System.out.println("Keine Primzahl"); 
//                }
//                else
//                {
//                    System.out.println("Primzahl");
//                }
                setPrimeTester();
            } else if (bob == 3)
            {
//                String str = "" + bob2;
//                String result = "";
//                for (int x = str.length() - 1; x >= 0; x--)
//                {
//                    result += str.charAt(x);
//                }
//
//                if (result.equals(str))
//                {
//                    System.out.println("Palindrom");
//                } else
//                {
//                    System.out.println("Kein Palindrom");
//                }
                setPalindromeTester();
            }
        }
    }

}
