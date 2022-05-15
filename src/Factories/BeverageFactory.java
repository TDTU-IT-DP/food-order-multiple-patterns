package Factories;

import Beverage.Beverage;

public interface BeverageFactory {
    public Beverage makeBeverage(String beverageType);
}
