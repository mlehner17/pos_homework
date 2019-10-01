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
public abstract class AbstractCalculator
{
    protected Number.CalculationOperation add;
        protected Number.CalculationOperation subtract;
        protected Number.CalculationOperation multiply;
        protected Number.CalculationOperation divide;
        
        public AbstractCalculator(Number.CalculationOperation add, 
                Number.CalculationOperation subtract, 
                Number.CalculationOperation multiply, 
                Number.CalculationOperation divide){}
                
                public abstract Number add(Number a, Number b);
                public abstract Number subtract(Number a, Number b);
                public abstract Number multiply(Number a, Number b);
                public abstract Number divide(Number a, Number b);
                
}

