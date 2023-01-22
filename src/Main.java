import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Step4- Object Declaration:
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();
        //Step5- Pricing:
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        Scanner input = new Scanner(System.in);
        //pricing for standard 'Cupcake'
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        cupcake.type();
        System.out.println("How much would you like to be charged for the (standard) cupcake?" + "\n(Input a numerical number taken to 2 decimal places");
        String priceText = input.nextLine();

        //This is the double price variable for the cupcakes on the menu
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);
        //pricing for 'RedVelvet' cupcake
        System.out.println("We are deciding on the price for our Red Velvet cupcake. Here is the description: ");
        redVelvet.type();
//        Thread.sleep(10); //<<--Optional thread.sleep method
        System.out.println("How much would you like to be charged for the cupcake?" + "\n(Input a numerical number taken to 2 decimal places");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price); //<<<-----This might be wrong, try replacing 'priceText' with 'price' or vice versa
        //pricing for 'Chocolate' cupcake
        System.out.println("We are deciding on the price for our Chocolate cupcake. Here is the description: ");
        chocolate.type();
        System.out.println("How much would you like to be charged for the cupcake?" + "\n(Input a numerical number taken to 2 decimal places");
        priceText = input.nextLine();
        price =  Double.parseDouble(priceText);
        chocolate.setPrice(price);
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        //PP2-Step4 -Object Declaration:
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();



        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        //PP2-Step5 -Pricing: for Drinks
        System.out.println("We are in the middle of creating the drinks menu. We currently have three different drinks on our menu but we need to decide on pricing.");
        //pricing for standard drink 'Water'
        System.out.println("We are deciding on the price for our standard drink,(which is bottled water). Here is the description: ");
        water.type();
        System.out.println("How much would you like to be charged for the bottled water?" + "\n(Input a numerical number taken to 2 decimal places");

        String priceTextDrink = input.nextLine();

        double priceDrink = Double.parseDouble(priceTextDrink);

        water.setPrice(priceDrink);
        //pricing for 'Soda'
        System.out.println("We are deciding on the price for our soda. Here is the description: ");
        soda.type();
        System.out.println("How much would you like to be charged for the canned soda?" + "\n(Input a numerical number taken to 2 decimal places");
        priceTextDrink = input.nextLine();
        priceDrink = Double.parseDouble(priceTextDrink);
        soda.setPrice(priceDrink);
        //pricing for 'Milk'
        System.out.println("We are deciding on the price for our glass of milk. Here is the description: ");
        milk.type();
        System.out.println("How much would you like to be charged for the glass of milk" + "\n(Input a numerical number taken to 2 decimal places");
        priceTextDrink = input.nextLine();
        priceDrink = Double.parseDouble(priceTextDrink);
        milk.setPrice(priceDrink);
        //Add the Drink choices to the 'drinkMenu':
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        //PP3-Step5-Constructor Call: of 'Order'
        new Order(cupcakeMenu, drinkMenu);



    }
}
//Step2- 'Generic Cupcake':
class Cupcake{
    public double price;
    public double getPrice(){
        return price;
    };
    public void setPrice(double price){
        this.price = price;
    };
    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    };
}
    //RedVelvet Cupcake Class:
class RedVelvet extends Cupcake{
    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    };
    }
    //Chocolate Cupcake Class:
class Chocolate extends Cupcake{
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    };
    }

//PP (ProjectPart) 2-Soda Machine:
//PP2-Step2 - Implementation of Parent Class:
class Drink{
    public  double price;
    public double getPrice(){
        return price;
    };

    public void setPrice(double price){
        this.price = price;
    }
    public void type(){
        System.out.println(" A bottle of water. ");
    }

}
//PP2-Step3 - Child Classes:
class Soda extends Drink{
    public void type(){
        System.out.println(" A can of soda. ");
    }
}
class Milk extends Drink{
    public void type(){
        System.out.println(" A glass cup of milk. ");
    }
}

