package Beverage;

public abstract class HotBeverage implements Beverage {

	public abstract double cost();
    public abstract String getDescription();

	//template method
    @Override
    public void prepareBeverage(){
        boilWater();
        brew();
        poutInCup();

        if(customerWantsCondiment() == true){
            addCondiment();
        }
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public void poutInCup(){
        System.out.println("Pouring in cup");
    }

	public abstract void addCondiment();

	public abstract boolean customerWantsCondiment();

}
