/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel3;

import com.sun.media.sound.SoftAbstractResampler;

/**
 *
 * @author lehne
 */
public class Main
{
    public static void main(String[] args)
    {
        NumberTester nt = new NumberTester("dokument.txt");
        nt.testFile(); 
    }
}
