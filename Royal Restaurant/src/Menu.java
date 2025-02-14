import java.time.LocalDate;

public class Menu {
    private int id;
    private String name;
    private LocalDate dateCreated;
    private String Type;
    private String dishes;
    
    public Menu (int id, String name, LocalDate dateCreated, String Type, String dishes) {

        this.id = id ;
        this.name = name ;
        this.dateCreated = dateCreated ;
        this.Type = Type ;
        this.dishes = dishes ;
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

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String Dishes) {
        this.dishes = Dishes;
    }

    public String toString() {
        String answer = "Menu : " + name
                        + ", Date de création : " + dateCreated
                        + ", Type de menu : " + Type
                        + ", Plats du menu : " + dishes;
        return answer;
    }
}
