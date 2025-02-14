
public class Restaurant {
    private int id;
    private String name;
    private String adresse;
    private String menu; 
    private String order; 
    private String employee;
    
    public Restaurant (int id, String name, String adresse, String menu, String order, String employee) {

        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.menu = menu; 
        this.order = order; 
        this.employee = employee;

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String toString() {
        String answer = "Restaurant : " + name
                        + ", Adresse : " + adresse
                        + ", Menu : " + menu 
                        + ", Commande : " + order 
                        + ", Employee : " + employee;
        return answer;
    }
}
