import java.util.ArrayList;

public class Order {
    private int numOrder;
    private ArrayList<Dish> dishes;
    private float Total;
    
    public Order (int numOrder) {
        this.numOrder = numOrder ;
        this.dishes = new ArrayList<>();

    }

    public int getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        String answer = "Commande #" + numOrder + ": ";
                        
        for (Dish dish : dishes) {
            String listFormat = "   - " + dish.getName();
            answer += listFormat;
        }

        answer + ", Type de menu : " + Total ;
        return answer;
    }
}
