package Midterm;

public class Pasta extends Menu {
    public Pasta(String menu){
        super(menu);
        setPrice();
    }

    public void setPrice(){
        super.foodPrice = 19;
    }
    
    public String showInfo(){
        return super.getMenu();
    }
}
