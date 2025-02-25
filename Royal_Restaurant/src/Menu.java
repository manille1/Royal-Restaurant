import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private int id;
    private String name;
    private LocalDate dateCreated;
    private String Type;
    private ArrayList<Dish> dishes;
    
    public Menu (int id, String name, LocalDate dateCreated, String Type) {
        this.id = id ;
        this.name = name ;
        this.dateCreated = dateCreated ;
        this.Type = Type ;
        this.dishes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        this.dateCreated = date;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void addDish (Dish dish) {
        dishes.add(dish);
    }

    public void deleteDish (Dish dish) {
        dishes.remove(dish);
    }

    public Dish getDishByName (String search) {
        String wordSearch = ".*" + search + ".*";

        for (Dish dish : dishes) {
            String dishName = dish.getName();
            if (dishName.matches(wordSearch)){
                return dish;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String answer = "Menu : " + name
                        + ", Date de création : " + dateCreated
                        + ", Type de menu : " + Type
                        + ", Plats du menu : \n" ;
        
        for (Dish dish : dishes) {
            answer += dish;
        }

        return answer;
    }
}
