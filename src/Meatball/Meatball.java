package Meatball;

public abstract class Meatball {
    String description = "" ;
    
    public abstract double cost();

    public String getDesciption(){
        return description;
    }

    public void prepareDough(String type){
        System.out.println("Chuẩn bị " + "thịt viên"+ type );
    }

    public void cookDough(String type) {
        System.out.println("Đang nấu " + type + " thịt viên");
    }

    public void dishUp(String type) {
        System.out.println(" " + type + " meatball on the dish");
    }
}
