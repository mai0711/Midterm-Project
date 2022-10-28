package Midterm;

public class Salad extends Menu {
        public Salad(String menu){
            super(menu);
            setPrice();
        }
    
        public void setPrice(){
            super.foodPrice = 15;
        }
        
        public String showInfo(){
            return super.getMenu();
        }
    }

