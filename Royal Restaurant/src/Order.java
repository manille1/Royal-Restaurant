public class Order {
    private int numOrder;
    private String dishes;
    private float Total;
    
    public Order (int numOrder, String dishes, float Total) {

        this.numOrder = numOrder ;
        this.dishes = dishes ;
        this.Total = Total ;
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

    public String toString() {
        String answer = "Menu : " + numOrder
                        + ", Date de création : " + dishes
                        + ", Type de menu : " + Total ;
        return answer;
    }
}
