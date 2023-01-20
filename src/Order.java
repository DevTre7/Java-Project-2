import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

//PP3- Customer Service -----------
public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu){
        //PP3-Step2 -Greeting
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        Scanner userInput = new Scanner(System.in); //<<-- Create an Scanner object called 'userInput'
        String placeOrder = userInput.nextLine(); //<<-- Create 'placeOrder' String variable and then assign the 'userInput' (from the user) to it.
        ArrayList<Object> order = new ArrayList<Object>(); //<<-- Create an ArrayList of 'Object's called 'order'

        if( placeOrder.equalsIgnoreCase("Y")){

            //PP3-Step3 -Inside the IF Statement
            order.add(LocalDate.now()); //<<--Add the 'LocalDate now()' Method to the 'order' ArrayList
            order.add(LocalTime.now()); //<<--Add the 'LocalTime now()' Method to the 'order' ArrayList
            System.out.println("Here is the menu. ");
            System.out.println("CUPCAKES: ");
            int itemNumber = 0;
            //'for Loop' created to iterate through the 'cupcakeMenu' ArrayList using the '.size()' List method
            for(int i = 0; i < cupcakeMenu.size(); i++){
                itemNumber++;
                System.out.println(itemNumber);
                // Get the type of cupcake from the cupcakeMenu (aka the index (i) of cupcakeMenu) by calling the 'cupcakeMenu' ArrayList
                cupcakeMenu.get(i).type();
                //Print out the literal price of the specific cupcake (referenced from previous line of code) from the 'cupcakeMenu' ArrayList'  (via index (i) of the 'cupcakeMenu' ArrayList' & '.getPrice()' Method)
                System.out.println("Price: " + cupcakeMenu.get(i).getPrice());
                System.out.println();

            }

            System.out.println("DRINKS: ");

            //'for Loop' created to iterate through the 'drinkMenu' ArrayList using the '.size()' List method
            for(int i = 0; i < drinkMenu.size(); i++){
                System.out.println(itemNumber);
                //Get the type of drink by calling out the 'drinkMenu' ArrayList and using the '.get(i)' and '.type() Method on the said ArrayList
                drinkMenu.get(i).type();
                //Print out the literal price of the specific drink (referenced from previous line of code) from the 'drinkMenu' ArrayList'  (via index (i) of the 'drinkMenu' ArrayList' & '.getPrice()' Method)
                System.out.println("Price: " + drinkMenu.get(i).getPrice());
                System.out.println();
            };
            //PP3-Step4 -Place Order:
            boolean ordering = true;

            //A while loop that continues as long as the value of ordering is true
            while(ordering == true){
                System.out.println(" What would you like to order? Please use the number associated with each item to order. ");
                //Create an int variable called 'orderChoice' and save the user's input (aka 'userInput.nextInt()' variable) to this variable
                int orderChoice = userInput.nextInt();
                //Call userInput.nextLine() to correct the terminal scanner input location.
                userInput.nextLine();
                //'If' & 'Else If' Statements that checks whether the user's 'orderChoice' ie equal to either 1,2,3,4,5,6 (choice selections from the cupcakeMenu ArrayList).
                        //----The following line explains the purpose of the code that's within the curly braces of the 'If' & 'Else If' Statements
                //If the user's input (orderChoice) equals/ matches the number, add the corresponding item (index position) from the 'cupcakeMenu' ArrayList to the order 'ArrayList'. And then print Item added to order'.
                if(orderChoice == 1){
                    order.add(cupcakeMenu.get(0));
                    System.out.println("Item added to order. ");
                }
                //An 'Else If' statement that checks if 'orderChoice' equals 2
                else if(orderChoice == 2){
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item added to order. ");
                }
                //An 'Else If' statement that checks if 'orderChoice' equals 3
                else if(orderChoice == 3){
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item added to order. ");
                }
                //An 'Else If' statement that checks if 'orderChoice' equals 4
                else if(orderChoice == 4){
                    order.add(cupcakeMenu.get(3));
                    System.out.println("Item added to order. ");
                }
                //An 'Else If' statement that checks if 'orderChoice' equals 5
                else if (orderChoice == 5) {
                    order.add(cupcakeMenu.get(4));
                    System.out.println("Item added to order. ");
                }
                //An 'Else If' statement that checks if 'orderChoice' equals 6
                else if(orderChoice == 6){
                    order.add(cupcakeMenu.get(5));
                    System.out.println("Item added to order. ");
                }
                else
                {
                    System.out.println("Sorry, we don't seem to have that on the menu. ");
                }

                System.out.println(" Would you like to continue ordering? (Y/N) ");

                placeOrder = userInput.nextLine();
                //Check if 'placeOrder' equals 'Y', if so then set 'ordering' equal to 'false'
                if(!placeOrder.equalsIgnoreCase("Y")){
                    ordering = false;
                }
            }




        }
        else{
            System.out.println("Have a NICE day then! ");
        }

    };
}










