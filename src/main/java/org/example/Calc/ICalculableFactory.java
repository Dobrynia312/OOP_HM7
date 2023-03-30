package org.example.Calc;

import org.example.Chislo.Chislo;

public interface ICalculableFactory {
    CalculatorImpl create(Chislo number1, Chislo number2);
}
