package Midterm;

public class Risotto extends Menu {
    public Risotto(String menu){
        super(menu);
        setPrice();
    }

    public void setPrice(){
        super.foodPrice = 18;
    }
    
    public String showInfo(){
        return super.getMenu();
    }

    
}
