import java.time.LocalDate;

public class Dish {
   private String name;
   private String description;
   private int price;
   private int calorie;
   private String category;
   private String sizePortion;
   private LocalDate dateAdded;
   private boolean Available;
   private String ingredients;
   private String typeCuisine;
   private int preparationTime;
   private int specialPrice;
   private String imageURL;

   public Dish (String name, String description, int price, int calorie, String category, String sizePortion, 
    LocalDate dateAdded, boolean Available, String ingredients, String typeCuisine, 
    int preparationTime, int specialPrice, String imageURL) {

        this.name = name ;
        this.description = description ;
        this.price = price ;
        this.calorie = calorie ;
        this.category = category ;
        this.sizePortion = sizePortion ;
        this.dateAdded = dateAdded ;
        this.Available = Available ;
        this.ingredients = ingredients ;
        this.typeCuisine = typeCuisine ;
        this.preparationTime = preparationTime ;
        this.specialPrice = specialPrice ;
        this.imageURL = imageURL ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSizePortion() {
        return sizePortion;
    }

    public void setSizePortion(String sizePortion) {
        this.sizePortion = sizePortion;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        this.dateAdded = date;
    }

    public boolean getAvailable() {
        return Available;
    }

    public void setvailable(boolean available) {
        this.Available = available;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredient) {
        this.ingredients = ingredient;
    }

    public String getTypeCuisine() {
        return typeCuisine;
    }

    public void setTypeCuisine(String typeOfCuisine) {
        this.typeCuisine = typeOfCuisine;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public int getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(int specialPrice) {
        this.specialPrice = specialPrice;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


    public String toString() {
        String answer = "Plat : " + name
                        + ", Description : " + description
                        + ", Prix : " + price
                        + ", Calorie : " + calorie
                        + ", Category : " + category
                        + ", Taille de la portion : " + sizePortion
                        + ", Date d'ajout : " + dateAdded
                        + ", Disponibilité : " + Available
                        + ", Ingredients : " + ingredients
                        + ", Type de cuisine : " + typeCuisine
                        + ", Temps de preparation : " + preparationTime
                        + ", Prix special : " + specialPrice
                        + ", Image : " + imageURL ;
        return answer;
    }
}
