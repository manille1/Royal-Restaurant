import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

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

    @Override
    public String toString() {
        String answer = "Restaurant #" + id + ": " + name
                        + ", Adresse : " + adresse
                        + ", Menu : " + menu 
                        + ", Commande : " + order 
                        + ", Employee : " + employee;
        return answer;
    }

    public void sauvegarder() {
        String fileName = String.format("rerstaurant %d.txt", id);
        File f = new File(fileName);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(f));
            //writer.append(id);
            writer.append(name);
            writer.append(adresse);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
