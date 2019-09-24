/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beispiel2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lehne
 */
public class HalloJavamitForEach
{
    
    
    public static void main(String[] args)
    {
        List<String> liste = new ArrayList();
        liste.add("Hallo");
        liste.add("Maxi");
        for(String cString : liste)
        {
            System.out.println(cString);
        }
        
        liste.forEach((cnsmr) -> System.out.println(cnsmr));
        
        liste.forEach(System.out:: println);
        
    }
}
