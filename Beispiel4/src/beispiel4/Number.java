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

    /**
     *
     */
    public abstract class AbstractCalculator{
        protected CalculationOperation add;
        protected CalculationOperation subtract;
        protected CalculationOperation multiply;
        protected CalculationOperation divide;
        
        public AbstractCalculator(Number.CalculationOperation add, 
                Number.CalculationOperation subtract, 
                Number.CalculationOperation multiply, 
                Number.CalculationOperation divide){}
                
                public abstract Number add(Number a, Number b);
                public abstract Number subtract(Number a, Number b);
                public abstract Number multiply(Number a, Number b);
                public abstract Number divide(Number a, Number b);
                }
}



