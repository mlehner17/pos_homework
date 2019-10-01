/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel4;

/**
 *
 * @author lehne
 */
public class Number
{
    private double a;
    private double b;
    private double x;
    //getter und setter 

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public void setB(double b)
    {
        this.b = b;
    }
    
  
    
    public interface CalculationOperation{
        Number calc(Number x, Number y);
    }
}



