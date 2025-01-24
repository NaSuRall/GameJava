import java.util.Scanner;

public class Game {


    public static void Joueurs() {

        Scanner scanner = new Scanner(System.in);
        //boucle qui va boucle autant de fois qu'il y a de joueur

        System.out.println("Combien il y a de Joueur Chef ? ");
        int NumberOfPlayers = scanner.nextInt();
        scanner.nextLine();


        for (int i = 1; i <= NumberOfPlayers; i++) {
            System.out.println("Renseigner Votre pseudo Player " + i + ":");
            String pseudo = scanner.nextLine();
            Player player = new Player(pseudo, 100, 1,0);

            System.out.println("Joueur " + i + ": " + player.getName() + " Hp: "+ player.getHp() + " Lvl: " + player.getLevel());


        }

    }

}
