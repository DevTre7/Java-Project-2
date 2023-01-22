import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
                itemNumber++;
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
            while(ordering){
                System.out.println(" What would you like to order? Please use the number associated with each item to order. ");
                //Create an int variable called 'orderChoice' and save the user's input (aka 'userInput.nextInt()' variable) to this variable
                int orderChoice = userInput.nextInt();
                //Call userInput.nextLine() to correct the terminal scanner input location.
                userInput.nextLine();
                //'If' & 'Else If' Statements that checks whether the user's 'orderChoice' ie equal to either 1,2,3,4,5,6 (choice selections from both the cupcakeMenu & drinkMenu ArrayList).
                        //----The following line explains the purpose of the code that's within the curly braces of the 'If' & 'Else If' Statements
                //If the user's input (orderChoice) equals/ matches the number, add the corresponding item (index position) from the 'cupcakeMenu' & 'drinkMenu' ArrayList to the order 'ArrayList'. And then print Item added to order'.
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
                    order.add(drinkMenu.get(0));
                    System.out.println("Item added to order. ");
                }
                //An 'Else If' statement that checks if 'orderChoice' equals 5
                else if (orderChoice == 5) {
                    order.add(drinkMenu.get(1));
                    System.out.println("Item added to order. ");
                }
                //An 'Else If' statement that checks if 'orderChoice' equals 6
                else if(orderChoice == 6){
                    order.add(drinkMenu.get(2));
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
            };
            //Print the first item of the 'order' ArrayList
            System.out.println(order.get(0));

            //Print the second item of the 'order' ArrayList
            System.out.println(order.get(1));

            //Create a double variable called "subtotal" set equal to '0.0'
            double subtotal = 0.0;
            //Check if 'order' at i (aka 'order.get(i)' is equal to cupcakeMenu at 0 (aka 'cupcakeMenu.get(0))
            for(int i = 2; i < order.size(); i++){
                if(order.get(i).equals(cupcakeMenu.get(0))){
                    //Get the value of cupcakeMenu @ index 0 and then run the type method on the said Cupcake Object
                    cupcakeMenu.get(0).type();
                    //Print the price of this specific cupcake,by using the 'getPrice()' method
                    System.out.println(cupcakeMenu.get(0).getPrice());
                    //Reassign the 'subtotal' equal to the sum of 'subtotal' & the price of the cupcake (at it's given index)
                    subtotal = subtotal + cupcakeMenu.get(0).getPrice(); //Or //subtotal += cupcakeMenu.get(0).getPrice();
                }
                //Check if 'order' at i (aka 'order.get(i)' is equal to cupcakeMenu at 1 (aka 'cupcakeMenu.get(1))
                else if(order.get(i).equals(cupcakeMenu.get(1))){
                    //Get the type of  cupcake at cupcakeMenu @ index 1, and then run the type method on the said Cupcake Object
                    cupcakeMenu.get(1).type();
                    //Print the price of this specific cupcake,by using the 'getPrice()' method
                    System.out.println(cupcakeMenu.get(1).getPrice());
                    //Set the 'subtotal' equal to 'subtotal' plus the 'cupcakeMenu' 'getPrice()' at 1
                    subtotal = subtotal + cupcakeMenu.get(1).getPrice();
                }
                //Check if 'order' at i is equal to 'cupcakeMenu' at 2
                else if(order.get(i).equals(cupcakeMenu.get(2))){
                    //Get the type of  cupcake at cupcakeMenu @ index 2, and then run the type method on the said Cupcake Object
                    cupcakeMenu.get(2).type();
                    //Print the price of this specific cupcake,by using the 'getPrice()' method
                    System.out.println(cupcakeMenu.get(2).getPrice());
                    //Set the 'subtotal' equal to 'subtotal' plus the 'cupcakeMenu' 'getPrice()' at 2
                    subtotal = subtotal + cupcakeMenu.get(2).getPrice();
                }
                // Check if order at i is equal to drinkMenu at 0
                else if (order.get(i).equals(drinkMenu.get(0)))
                {
                    // Get the type of drink at drinkMenu index 0
                    drinkMenu.get(0).type();
                    // Print the price of drink at drinkMenu index 0
                    System.out.println(drinkMenu.get(0).getPrice());
                    //Set 'subtotal' equal to 'subtotal' plus 'drinkMenu getPrice' at 0
                    subtotal = subtotal + drinkMenu.get(0).getPrice();
                }
                // Check if order at i is equal to drinkMenu at 1
                else if (order.get(i).equals(drinkMenu.get(1))){
                    //Get the type of drink at drinkMenu index 1
                    drinkMenu.get(1).type();
                    //Print the price of the drinkMenu index 1
                    System.out.println(drinkMenu.get(1).getPrice());
                    //Set 'subtotal' equal to 'subtotal' plus 'drinkMenu getPrice' at 1
                    subtotal = subtotal + drinkMenu.get(1).getPrice();
                }
                // Check if order at i is equal to drinkMenu at 2
                else if (order.get(i).equals(drinkMenu.get(2))){
                    //Get the type of drink at drinkMenu index 2
                    drinkMenu.get(2).type();
                    //Print the price of the drinkMenu index 2
                    System.out.println(drinkMenu.get(2).getPrice());
                    //Set 'subtotal' equal to 'subtotal' plus 'drinkMenu getPrice' at 2
                    subtotal = subtotal + drinkMenu.get(2).getPrice();
                }
                //Print out the 'subtotal' amount
                System.out.println("-----------------------------------");
                System.out.println(" Your Total is: $" + subtotal);

                //PP4-Step5- Function call: of 'CreateFile' & 'WriteToFile' (from PP4-Step4) :
                //Create a new 'CreateFile()'
                new CreateFile();
                //Create a new WriteToFile() with the parameter 'order'
                new WriteToFile(order);
            }

        }
        else{
            System.out.println("Have a NICE day then! ");
        }

    };
}

//PP4-Step2- Create File:
class CreateFile{
    //Create a public constructor 'Create File()'
    public CreateFile(){

        // Make a 'try - catch' block, w/ a catch parameter of 'IOException e'
        try {
            //Create a 'File' object names 'salesData' and set it equal to a new File w/ parameter 'salesData'
            File salesData = new File("salesData.txt");

            if(salesData.createNewFile()){
                System.out.println("File created: " + salesData.getName());
            }
            else {
                System.out.println("File already exists");
            }

        }
        catch (IOException e){
            System.out.println(" An error occurred. ");
        }
    }
}
////PP4-Step3- Write to File:
class WriteToFile{

    WriteToFile(ArrayList<Object> order){
        try{

            //Create a new 'FileWriter' object named 'fw' and set it equal to new 'FileWriter' object w/ 'salesData.txt' as a parameter
            FileWriter fw = new FileWriter("salesData.txt", true);
            //Create new 'PrintWriter' object called 'salesWriter' and set it equal to new 'PrintWriter' object w/ 'fw' as a parameter
            PrintWriter salesWriter = new PrintWriter(fw);

            //Print each value in order
            for ( int i = 0; i < order.size(); i++){
                salesWriter.println(order.get(i));
            }
            //Stop 'salesWriter' object from running continuously by using '.close()' method
            salesWriter.close();

            System.out.println(" Successfully wrote to the file. ");
        }
        catch (IOException e){
            System.out.println(" An error occurred ");

        }
    }
}








