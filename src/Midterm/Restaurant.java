package Midterm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args){

        Steak steak = new Steak("Beef Steak");
        Risotto risotto = new Risotto("Cheese Risotto");
        Pasta pasta = new Pasta("Carbonara");
        Pizza pizza = new Pizza("Margherita");
        Salad salad = new Salad("Grilled Chicken Salad");
     
      System.out.println("-----------------------------------------");
      System.out.println("|               Menu                     |");
      System.out.println("-----------------------------------------");
      System.out.print(" Today's special is ");
      
    double special = Math.random();   // tody's special is randomly selected
    if( special > 0.8){
      System.out.println(steak.showInfo());
    } else if( special >= 0.6){
      System.out.println(risotto.showInfo());
    } else if( special >= 0.4){
      System.out.println(pizza.showInfo());
    } else if( special >= 0.2){
      System.out.println(pasta.showInfo());
    } else {
      System.out.println(salad.showInfo());
    }

      System.out.println("-----------------------------------------");
      MenuArray.menuArray(); //  each menu item and price
      System.out.println("-----------------------------------------");
      System.out.println("|               Order form               |");
      System.out.println("-----------------------------------------");
      
      Scanner scanner = new Scanner(System.in);
      String name;
      int quantity = 0;
      int option = 0;
      boolean loop = true;
      
      System.out.println("Please enter your name ");
      name = scanner.nextLine();

  while(loop){  
    try {
      System.out.println("Please enter your order number from 1 to 5 ");
      option = scanner.nextInt();

      if(option >= 1 && option <= 5){
        loop = false;
      } else{
        System.out.println("Error: You should type between 1 - 5");
        loop = true;
      }
      
    }catch (InputMismatchException e){
      scanner.next();
      System.out.println("-----------------------------------------------");
      System.out.println("Error! Please reenter the numbers from 1 to 5! "); 
      System.out.println("-----------------------------------------------");
    }
    option = 0;
  }

  loop = true;
  while(loop){ 
    try {
      System.out.println("Please enter the quantity");
      quantity = scanner.nextInt();
      loop = false; 
    }catch (InputMismatchException e){
      scanner.next();
      System.out.println("-----------------------------------------");
      System.out.println("Error! Please reenter the correct number!"); 
      System.out.println("-----------------------------------------");
    }
  }

  try{
    for(int i = 0; i < 3; i++){
      System.out.print(" ");
      Thread.sleep(1000);
    } 
    System.out.println(" ");        
    System.out.println("-----------------------------------------");
    System.out.println("|         Order confirmation             |");
    System.out.println("-----------------------------------------"); 
  } catch(InterruptedException e){
    System.out.println("Error! Please reenter from the beginning!");
  }
  
  System.out.println("Your name: " + name); 

  switch(option){
        case 1:
        System.out.println("Your order: " + steak.showInfo());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + steak.getPrice()*quantity);
        break;
        case 2: 
        System.out.println("Your order: " + risotto.showInfo());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + risotto.getPrice()*quantity);
        break;
        case 3:
        System.out.println("Your order: " + pizza.showInfo());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + pizza.getPrice()*quantity);
        break;
        case 4:
        System.out.println("Your order: " + pasta.showInfo());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + salad.getPrice()*quantity);
        break;
        case 5:
        System.out.println("Your order: " + salad.showInfo());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + pasta.getPrice()*quantity);
        break;
        default:
        System.out.println("Error! Please reenter from the beginning!");
        break;
   }
    System.out.println("-----------------------------------------");
    System.out.println("Please select '1' or '2' ");
    System.out.println("1 : Confirm the order");
    System.out.println("2 : Cancel");

  try {
    int a = 0;
    a = scanner.nextInt();
  switch(a){
   case 1:        
    System.out.println("-----------------------------------------");
    System.out.println("|         Your order is complete!        |");
    System.out.println("-----------------------------------------"); 
    break;
   case 2:
    System.out.println("-----------------------------------------");
    System.out.println("|                Cancel!                 |");
    System.out.println("-----------------------------------------");
    break;
  default:
    System.out.println("-----------------------------------------");
    System.out.println("|                Error!                  |");
    System.out.println("-----------------------------------------");
    break;
  }
} catch(Exception e){
  System.out.println("------------------------------------------");
  System.out.println("|Error! Please reenter from the beginning!|");
  System.out.println("------------------------------------------");
}
    scanner.close();
  }
}