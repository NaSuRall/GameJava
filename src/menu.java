import java.util.Scanner;

public class menu {


    public void AfficherMenu(){
            Scanner scanner = new Scanner(System.in);
            int choix;

                do {
                    System.out.println("Menu Principal");
                    System.out.println("1. Nouvelle partie");
                    System.out.println("2. Parametre");
                    System.out.println("5. Quitter");


                    choix = scanner.nextInt();



                    switch (choix) {
                        case 1 -> LancementPartie();
                        case 2 -> Parametre();
                        case 5 -> System.exit(0);
                        default -> System.out.println("Choix invalide. Ressayez");
                    }
                }while (choix != 2);
                scanner.close();

    }

    private void Parametre(){
                System.out.println("Parametre");
                System.out.println("1. Regles");
                System.out.println("2. Ressources");
                System.out.println("3. Retour");
    }


    private void LancementPartie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lancement partie");
        Game.Joueurs();
        // Demander combien de joueur
        System.out.println("Wouhou !!! bienvenue ");
    }


}
