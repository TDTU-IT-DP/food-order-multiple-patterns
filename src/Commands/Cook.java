package Commands;

import Beverage.Beverage;
import Doner.*;
import Doner.TypeDecorators.*;
import Factories.*;
import Meatball.AppetizerDecorators.Blarney;
import Meatball.AppetizerDecorators.Grind;
import Meatball.AppetizerDecorators.PepperSalad;
import Meatball.AppetizerDecorators.Pickle;
import Meatball.FriesDecorators.BigSize;
import Meatball.FriesDecorators.MegaSize;
import Meatball.FriesDecorators.MidSize;
import Meatball.FriesDecorators.SmallSize;
import Meatball.Meatball;
import Meatball.SaladDecorators.*;
import Meatball.SauceDecorators.*;
import java.util.ArrayList;

public class Cook {
    String hotBeverageType, coldBeverageType, donerType, donerSize, meatballType;
    String[] meatBallSaladList, meatBallAppzetierList, meatBallFriesList, meatballSauceList;

    ArrayList<Beverage> beverageList  = new ArrayList<>();
    ArrayList<Doner> donerList = new ArrayList<>();
    ArrayList<Meatball> meatBallList  = new ArrayList<>();
    double totalCost = 0;

    public void getOrder(String factoryType){
        switch (factoryType){
            case "hotBeverage":
                HotBeverageFactory hotBevFactory = new HotBeverageFactory();
                Beverage orderedHotBeverage = hotBevFactory.makeBeverage(hotBeverageType);
                System.out.println(orderedHotBeverage.getDescription() +" order reveived.\n");
                beverageList.add(orderedHotBeverage);
                break;

            case "coldBeverage":
                ColdBeverageFactory coldBevFactory = new ColdBeverageFactory();
                Beverage orderedColdBeverage = coldBevFactory.makeBeverage(coldBeverageType);
                System.out.println(orderedColdBeverage.getDescription() +" order reveived.\n");
                beverageList.add(orderedColdBeverage);
                break;

            case "doner":
                System.out.println(donerSize + " size " + donerType +" doner order reveived.\n");
                DonerFactory donerFactory = new DonerFactory();
                Doner orderedDoner = donerFactory.makeDoner(donerType);
                orderedDoner = decorate(orderedDoner,donerSize);
                donerList.add(orderedDoner);
                break;

            case "meatball":
                MeatballFactory meatballFactory = new MeatballFactory();
                Meatball orderedMeatball = meatballFactory.makeMeatBall(meatballType);
                orderedMeatball = decorate(orderedMeatball,meatBallSaladList,meatBallAppzetierList,meatBallFriesList,meatballSauceList);
                System.out.println(orderedMeatball.getDescription() + " meatball order reveived.\n");
                meatBallList.add(orderedMeatball);
                break;
        }

    }

    public void cookOrder() {
        for (Beverage beverage:beverageList
        ) {
            beverage.prepareBeverage();
            totalCost += beverage.cost();
            System.out.println(beverage.getDescription() + " cost is --> "+ beverage.cost() +"\n\n");
        }

        for (Doner doner:donerList
        ) {
            doner.prepareDough(doner.getDescription());
            doner.cookDough(doner.getDescription());
            doner.dishUp(doner.getDescription());
            System.out.println(doner.getDescription() + " cost is --> "+ doner.cost()+"\n\n");
            totalCost += doner.cost();
        }

        for (Meatball meatball:meatBallList
        ) {
            meatball.prepareDough(meatball.getDescription());
            meatball.cookDough(meatball.getDescription());
            meatball.dishUp(meatball.getDescription());
            System.out.println(meatball.getDescription() + " cost is --> "+ meatball.cost()+"\n\n");
            totalCost += meatball.cost();
        }

        System.err.println("Total cost is " + totalCost);
    }

    public Doner decorate(Doner doner, String typeDecorator){
        switch (typeDecorator) {
            case "iskender":
                 doner = new Iskender(doner);
                 break;
            case "roll":
                 doner = new Roll(doner);
                 break;
            case "sandwich":
                 doner = new Sandwich(doner);
                 break;
            case "kilogram":
                 doner = new Kilogram(doner);
                 break;
            case "hamburger":
                 doner = new Hamburger(doner);
                 break;
            default:
                break;
        }
        return doner;
    }

    public Meatball decorate(Meatball meatball, String[] meatBallSaladList,String[] meatBallAppzetierList, String[]meatBallFriesList, String[]meatballSauceList){
        for (int i = 0; i < meatBallSaladList.length; i++) {
            switch (meatBallSaladList[i].toLowerCase()) {
                case "coban":
                     meatball = new CobanSalad(meatball);
                     break;
                case "gevurdagi":
                     meatball = new GevurdagiSalad(meatball);
                     break;
                case "mediterrian":
                     meatball = new MediterrianSalad(meatball);
                     break;
                case "onion":
                     meatball = new OnlyOnion(meatball);
                case "pepper":
                     meatball = new OnlyPepper(meatball);
                     break;
                case "tomato":
                     meatball = new OnlyTomato(meatball);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < meatBallAppzetierList.length; i++) {
            switch (meatBallAppzetierList[i].toLowerCase()) {
                case "blarney":
                     meatball = new Blarney(meatball);
                     break;
                case "grind":
                     meatball = new Grind(meatball);
                     break;
                case "peppersalad":
                     meatball = new PepperSalad(meatball);
                     break;
                case "pickle":
                     meatball = new Pickle(meatball);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < meatBallFriesList.length; i++) {
            switch (meatBallFriesList[i].toLowerCase()) {
                case "big":
                     meatball = new BigSize(meatball);
                     break;
                case "mid":
                     meatball = new MidSize(meatball);
                     break;
                case "small":
                     meatball = new SmallSize(meatball);
                     break;
                case "mega":
                     meatball = new MegaSize(meatball);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < meatballSauceList.length; i++) {
            switch (meatballSauceList[i].toLowerCase()) {
                case "barbeque":
                     meatball = new Barbeque(meatball);
                     break;
                case "hotsauce":
                     meatball = new HotSauce(meatball);
                     break;
                case "ketchup":
                     meatball = new Ketchup(meatball);
                     break;
                case "mayonnaise":
                     meatball = new Mayonnaise(meatball);
                     break;
                default:
                    break;

            }
        }
        return meatball;
    }

}