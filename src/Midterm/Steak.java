package Midterm;

public class Steak extends Menu{
    public Steak(String menu){
        super(menu);
        setPrice();
    }

    public void setPrice(){
        super.foodPrice = 23;
    }

    public String showInfo(){
        return super.getMenu();
    
    }

    
}
