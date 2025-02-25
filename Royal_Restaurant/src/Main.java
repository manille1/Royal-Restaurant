import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour, bienvenue sur le système de gestion de ROYAL RESTAURANT !\nQue voulez vous faire ? (indiquez le chiffre)");
        System.out.println("1. Ajouter un restaurant.\n"
                            +"2. Ajouter un employé à un restaurant.\n"
                            +"3. Ajouter un plat au menu d'un restaurant.\n"
                            +"4. Prendre une commande dans un restaurant.\n"
                            +"5. Afficher les employés et les commandes d'un restaurant.\n"
                            +"6. Ajouter un menu dans un restaurants.\n"
                            +"7. Quitter.");

        while(true){ 
            Command[] commands = {
                new Royal_Restaurant.src.Commands.AddRestaurant(scanner),
                new Royal_Restaurant.src.Commands.PrintRestaurantList(),
                new Royal_Restaurant.src.Commands.Quit()
            };

            for (int i = 0; i < commands.length; i++) {
                System.out.println((i + 1) + ". " + commands[i].getLabel());
            }
            
            int choice = chooseOption(scanner);

            if (choice < 0 || choice >= commands.length) {
                System.out.println("Choix inconnue");
                continue;
            }

            commands[choice].execute();
        }
    }

    private static int chooseOption(Scanner scanner) {
        try {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.next();
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }
}
