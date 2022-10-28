package Midterm;

public class Pizza extends Menu {
    public Pizza(String menu){
        super(menu);
        setPrice();
    }

    public void setPrice(){
        super.foodPrice = 20;
    }
    
    public String showInfo(){
        return super.getMenu();
    }

    
}
    
