package Factories;

import Meatball.*;

public class MeatballFactory {
    public Meatball makeMeatBall(String meatballType) {
        switch (meatballType){
            case "serving":
                return new ServingSize();
            case "five":
                return new WithFive();
            case "pita":
                return new WithPita();
            case "kilogram":
                return new KilogramsSize();
            case "sandwich":
                return new Sandwich();
            default:
                return null;
        }
    }
}
