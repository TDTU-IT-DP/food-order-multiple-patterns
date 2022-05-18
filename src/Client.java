import java.util.*;

import Commands.*;

public class Client {
    static Cook cook;
    static Waitress waitress;

    public static void main(String[] args){
        cook = new Cook();
        waitress = new Waitress();

        Scanner scanner = new Scanner(System.in);
        System.out.println("********* Welcome to The August Coffee *********");

        boolean whileLoopKey = true;

        while(whileLoopKey){
            System.out.println("What do you want to order?");
            System.out.println("1 --> Doner");
            System.out.println("2 --> Meatball");
            System.out.println("3 --> Beverage");
            System.out.println("0 --> I have finished ordering. Prepare please.");

            int orderType = scanner.nextInt();

            switch(orderType){
                case 1: 
                    selectDonerType(scanner);
                    break;
                case 2: 
                    selectMeatball(scanner);
                    break;
                case 3: 
                    selectBerverageType(scanner);
                    break;
                case 0: 
                    whileLoopKey = false;
                    break;
                default: 
                    System.out.println("Not defined selection. ");
            }

        }
        cook.cookOrder();
    }
    private static void selectDonerType(Scanner scanner){
        boolean whileLoopKey = true;

        while(whileLoopKey){
            System.out.println("Which type do you want?");
            System.out.println("1 --> Meat");
            System.out.println("2 --> Chicken");
            System.out.println("0 --> I don't want Doner. Back.");

            int selection = scanner.nextInt();
            switch (selection){
                case 1: 
                    selectDonerSize("meat", scanner);
                    break;
                case 2: 
                    selectDonerSize("chicken", scanner);
                    break;
                default: 
                    whileLoopKey = false;
                    break;
            }
        }
    }

    private static void selectMeatball(Scanner scanner){
        boolean whileLoopKey = true;
        while(whileLoopKey){
            System.out.println("Which size do you want?");
            System.out.println("1 --> Serving Size");
            System.out.println("2 --> Serving size with pita");
            System.out.println("3 --> 1 kilogram");
            System.out.println("4 --> Sandwich");
            System.out.println("5 --> 5 pieces of meatball");
            System.out.println("0 --> I don't want Meatball. Back.");

            int selection = scanner.nextInt();
            switch(selection){
                case 1:
                    MeatballOrder meatballServing = selectMeatballDecorator("serving", scanner);
                    waitress.takeOrder(meatballServing);
                    break;
                case 2:
                    MeatballOrder meatballPita = selectMeatballDecorator("pita", scanner);
                    waitress.takeOrder(meatballPita);
                    break;
                case 3:
                    MeatballOrder meatballKilogram = selectMeatballDecorator("kilogram", scanner);
                    waitress.takeOrder(meatballKilogram);
                    break;
                case 4:
                    MeatballOrder meatballSandwich = selectMeatballDecorator("sandwich", scanner);
                    waitress.takeOrder(meatballSandwich);
                    break;
                case 5:
                    MeatballOrder meatballFive = selectMeatballDecorator("five", scanner);
                    waitress.takeOrder(meatballFive);
                    break;
                default:
                    whileLoopKey = false;
                    break;

            }
        }
    }

    private static void selectBerverageType(Scanner scanner){
        boolean whileLoopKey = true;
        while(whileLoopKey){
            System.out.println("Which type of beverage do you want to drink?");
            System.out.println("1 --> Hot");
            System.out.println("2 --> Cold");
            System.out.println("0 --> I don't want beverage. Back.");

            int beverageType = scanner.nextInt();
            switch(beverageType){
                case 1:
                    selectHotBeverage(scanner);
                    break;
                case 2:
                    selectColdBeverage(scanner);
                    break;
                default:
                    whileLoopKey = false;
                    break;
            }
        }
    }

    private static void selectDonerSize(String order, Scanner scanner){
        System.out.println("Which size do you want?");
        System.out.println("1 --> Iskender");
        System.out.println("2 --> Roll");
        System.out.println("3 --> Hamburger");
        System.out.println("4 --> Sandwich");
        System.out.println("5 --> Kilogram");
        System.out.println("0 --> I don't want Doner. Back.");

        int size = scanner.nextInt();
        switch(size){
            case 1: 
                DonerOrder donerIskender = new DonerOrder(cook, order, "iskender");
                waitress.takeOrder(donerIskender);
                break;
            case 2: 
                DonerOrder donerRoll = new DonerOrder(cook, order, "roll");
                waitress.takeOrder(donerRoll);
                break;
            case 3: 
                DonerOrder donerHamburger = new DonerOrder(cook, order, "hamburger");
                waitress.takeOrder(donerHamburger);
                break;
            case 4: 
                DonerOrder donerSandwich = new DonerOrder(cook, order, "sandwich");
                waitress.takeOrder(donerSandwich);
                break;
            case 5: 
                DonerOrder donerKilogram = new DonerOrder(cook, order, "kilogram");
                waitress.takeOrder(donerKilogram);
                break;
            case 0: 
                break;
        }
    }

    private static MeatballOrder selectMeatballDecorator(String order, Scanner scanner){
        ArrayList<String> sauceList = new ArrayList<>();
        ArrayList<String> saladList = new ArrayList<>();
        ArrayList<String> appzetierList = new ArrayList<>();
        ArrayList<String> friesList = new ArrayList<>();

        boolean whileLoopKey = true;
        while (whileLoopKey){
            System.out.println("What do you want with your meatball?");
            System.out.println("1 --> Salad");
            System.out.println("2 --> Appsetier");
            System.out.println("3 --> Sauce");
            System.out.println("4 --> Fries");
            System.out.println("0 --> Nothing");

            int selection = scanner.nextInt();

            switch(selection){
                case 1:
                    System.out.println("Which salad do you want?");
                    System.out.println("1 --> Mediterrian");
                    System.out.println("2 --> Coban");
                    System.out.println("3 --> Gevurdagi");
                    System.out.println("4 --> Onion");
                    System.out.println("5 --> Pepper");
                    System.out.println("6 --> Tomato");
                    System.out.println("0 --> Nothing");

                    int salad = scanner.nextInt();

                    switch(salad){
                        case 1:
                            saladList.add("mediterrian");
                            break;
                        case 2:
                            saladList.add("coban");
                            break;
                        case 3:
                            saladList.add("gevurdagi");
                            break;
                        case 4:
                            saladList.add("onion");
                            break;
                        case 5:
                            saladList.add("pepper");
                            break;
                        case 6:
                            saladList.add("tomato");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Which appzetier do you want?");
                    System.out.println("1 --> Blarney");
                    System.out.println("2 --> Grind");
                    System.out.println("3 --> Pepper Salad");
                    System.out.println("4 --> Pickle");
                    System.out.println("0 --> Nothing");

                    int appzetier = scanner.nextInt();

                    switch(appzetier){
                        case 1: 
                            appzetierList.add("blarney");
                            break;
                        case 2: 
                            appzetierList.add("grind");
                            break;
                        case 3: 
                            appzetierList.add("peppersalad");
                            break;
                        case 4: 
                            appzetierList.add("pickle");
                            break;
                        
                    }
                    break;
                
                case 3:
                    System.out.println("Which sauce do you want?");
                    System.out.println("1 --> Barbeque");
                    System.out.println("2 --> Hot Sauce");
                    System.out.println("3 --> Ketchup");
                    System.out.println("4 --> Mayonnaise");
                    System.out.println("0 --> Nothing");

                    int sauce = scanner.nextInt();

                    switch(sauce){
                        case 1:
                            sauceList.add("barbeque");
                            break;
                        case 2:
                            sauceList.add("hotsauce");
                            break;
                        case 3:
                            sauceList.add("ketchup");
                            break;
                        case 4:
                            sauceList.add("mayonnaise");
                            break;   
                    }
                    break;
                case 4:
                    System.out.println("Which fries size do you want?");
                    System.out.println("1 --> Big Size");
                    System.out.println("2 --> Mid Size");
                    System.out.println("3 --> Small Size");
                    System.out.println("4 --> Mega Size");
                    System.out.println("0 --> Nothing");

                    int fries = scanner.nextInt();

                    switch(fries){
                        case 1:
                            friesList.add("big");
                            break;
                        case 2:
                            friesList.add("mid");
                            break;
                        case 3:
                            friesList.add("small");
                            break;
                        case 4:
                            friesList.add("mega");
                            break;
                    }
                    break;

                default:
                    whileLoopKey = false;
                    break;
            }
        }

        String[] saladArr = new String[saladList.size()];
        String[] appzetierArr = new String[appzetierList.size()];
        String[] sauceArr = new String[sauceList.size()];
        String[] friesArr = new String[friesList.size()];
        
        saladArr = saladList.toArray(saladArr);
        appzetierArr = appzetierList.toArray(appzetierArr);
        sauceArr = sauceList.toArray(sauceArr);
        friesArr = friesList.toArray(friesArr);
        return new MeatballOrder(cook, order, saladArr, appzetierArr, sauceArr, friesArr);
    }

    private static void selectColdBeverage(Scanner scanner){
        System.out.println("What do you want to drink?");
        System.out.println("1 --> Cola");
        System.out.println("2 --> Fanta");
        System.out.println("3 --> FuseTea");
        System.out.println("4 --> lemonade");
        System.out.println("5 --> Sprite");
        System.out.println("6 --> Water");
        System.out.println("7 --> Orange Juice");
        System.out.println("0 --> I don't want beverage. Back.");

        int coldSelection = scanner.nextInt();

        switch(coldSelection){
            case 1:
                ColdBeverageOrder colaOrder = new ColdBeverageOrder(cook, "cola");
                waitress.takeOrder(colaOrder);
                break;
            case 2:
                ColdBeverageOrder fantaOrder = new ColdBeverageOrder(cook, "fanta");
                waitress.takeOrder(fantaOrder);
                break;
            case 3:
                ColdBeverageOrder fuseOrder = new ColdBeverageOrder(cook, "fuseTea");
                waitress.takeOrder(fuseOrder);
                break;
            case 4:
                ColdBeverageOrder lemonadeOrder = new ColdBeverageOrder(cook, "lemonade");
                waitress.takeOrder(lemonadeOrder);
                break;
            case 5:
                ColdBeverageOrder spriteOrder = new ColdBeverageOrder(cook, "sprite");
                waitress.takeOrder(spriteOrder);
                break;
            case 6:
                ColdBeverageOrder waterOrder = new ColdBeverageOrder(cook, "water");
                waitress.takeOrder(waterOrder);
                break;
            case 7:
                ColdBeverageOrder orangeOrder = new ColdBeverageOrder(cook, "orangeJuice");
                waitress.takeOrder(orangeOrder);
                break;
            default:
                break;
        }
    }

    private static void selectHotBeverage(Scanner scanner){
        System.out.println("What do you want to drink?");
        System.out.println("1 --> Black Coffee");
        System.out.println("2 --> Cappuccino");
        System.out.println("3 --> Hot Chocolate");
        System.out.println("4 --> Latte");
        System.out.println("5 --> Mocha");
        System.out.println("6 --> Espresso");
        System.out.println("7 --> Tea");
        System.out.println("8 --> Nescafe");
        System.out.println("0 --> I don't want to beverage. Back.");

        int hotSelection = scanner.nextInt();

        switch(hotSelection){
            case 1: 
                HotBeverageOrder  blackCoffeeOrder = new HotBeverageOrder(cook, "black");
                waitress.takeOrder(blackCoffeeOrder);
                break;
            case 2: 
                HotBeverageOrder  hotChoOrder = new HotBeverageOrder(cook, "hotchocolate");
                waitress.takeOrder(hotChoOrder);
                break;
            case 3: 
                HotBeverageOrder  latteOrder = new HotBeverageOrder(cook, "latte");
                waitress.takeOrder(latteOrder);
                break;
            case 4: 
                HotBeverageOrder  mochaOrder = new HotBeverageOrder(cook, "mocha");
                waitress.takeOrder(mochaOrder);
                break;
            case 5: 
                HotBeverageOrder  espressoOrder = new HotBeverageOrder(cook, "espresso");
                waitress.takeOrder(espressoOrder);
                break;
            case 6: 
                HotBeverageOrder  teaOrder = new HotBeverageOrder(cook, "tea");
                waitress.takeOrder(teaOrder);
                break;
            case 7: 
                HotBeverageOrder  nescafeOrder = new HotBeverageOrder(cook, "nescafe");
                waitress.takeOrder(nescafeOrder);
                break;
            default: 
                break;
                
                
        }
    }

}

