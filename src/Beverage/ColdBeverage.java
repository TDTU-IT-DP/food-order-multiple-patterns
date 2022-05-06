package Beverage;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ColdBeverage implements Beverage {

    public abstract double cost();
    public abstract String getDescription();

    // template method
    @Override
    public void prepareBeverage(){
        uncoverBeverage();
        poutInGlass();
        putStraw();

        if(customerWantIce() == true){
            addIce();
        }
    }

    public void uncoverBeverage(){
        System.out.println("Uncovering the Beverage");
    }

    public void poutInGlass(){
        System.out.println("Pouring into glass");
    }

    public void putStraw(){
        System.out.println("Put straw in glass");
    }

    public void addIce(){
        System.out.println("Adding ice");
    }

    // hook
    public boolean customerWantIce(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like ice? (y/n)");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = input.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }

        if(answer == null){
            answer = "no";
        }
        return answer;

    }
}
