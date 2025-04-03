package ex_11_multilevelInheritance;

public class Lab02_Dealership extends Lab01_Vehicles{

    public static void main(String[] args) {
        Lab01_Vehicles v1 = new Lab01_Vehicles();

        String make = "Toyota";

        double price = 400000;

        v1.vehicle1();

        v1.vehicle2();

    }
    void OptionsToBuy(){

        System.out.println("The buyer has only option to buy four wheeler!");
    }
}
