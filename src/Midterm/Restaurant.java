package Midterm;

import java.io.OptionalDataException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ForkJoinWorkerThread;

public class Restaurant {
    public static void main(String[] args){

    

        Steak steak = new Steak("Steak");
        Risotto risotto = new Risotto("Cheese Risotto");
        Pasta pasta = new Pasta("Carbonara");
        Pizza pizza = new Pizza("Margerita");
        Salad salad = new Salad("Grilled Chicken Salad");

        System.out.println("-----------------------------------------");
        System.out.print("Today's special is ");

      double special = Math.random();   // 0.0～1.0
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
      System.out.println("Menu:");

      MenuArray.menuArray();
      System.out.println("-----------------------------------------");
      
    

    
      Scanner scanner = new Scanner(System.in);
      String name;
      String order = "";
      int quantity = 0;
      int option = 0;
      boolean loop = true;


      
      System.out.println("Please enter your name ");
      name = scanner.nextLine();



    while(loop){
      
    try {
      System.out.println("Please enter your order ");
      option = scanner.nextInt();
      loop = false;

      
    }catch (InputMismatchException e){
      scanner.next();
      System.out.println("Error!"); 

    }
  }

  loop = true;
  while(loop){
      
    try {
      System.out.println("Please enter your quantity ");
      quantity = scanner.nextInt();
      loop = false;

      
    }catch (InputMismatchException e){
      scanner.next();
      System.out.println("Error!"); 

    }
  }
      
  

      System.out.println("-----------------------------------------");
      System.out.println("Order confirmation:");
      System.out.println("-----------------------------------------");
      System.out.println("Your name: " + name);
      System.out.println("Your order: " + option );
      System.out.println("Quantity: " + quantity);

      switch(option){
        case 1:
        System.out.println("Total: " + steak.getPrice()*quantity);
        break;
        case 2:
        System.out.println("Total: " + risotto.getPrice()*quantity);
        break;
        case 3:
        System.out.println("Total: " + pizza.getPrice()*quantity);
        break;
        case 4:
        System.out.println("Total: " + salad.getPrice()*quantity);
        break;
        case 5:
        System.out.println("Total: " + pasta.getPrice()*quantity);
        break;
        default:
        System.out.println("default");
        break;
      }
    
    
    scanner.close();
    
  }
}
