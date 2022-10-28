package Midterm;

public class MenuArray {
    public static void menuArray(){
        Menu menus[] = new Menu[5];
            menus[0] = new Steak("Beef Steak");
            menus[1] = new Risotto("Cheese Risotto");
            menus[2] = new Pizza("Margherita");
            menus[3] = new Pasta("Carbonara");
            menus[4] = new Salad("Grilled Chicken Salad");
        
                for(int i = 0; i < menus.length; i++){
                    System.out.println((i+1)+ ". " + menus[i].foodMenu + " " + "$" + menus[i].foodPrice);
                 }
    }
}
