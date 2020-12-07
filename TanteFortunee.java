import java.util.Scanner;
public class TanteFortunee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//demander à l'utilisateur d'entrer la somme d'argent
		System.out.print("Combien avez-vous reçu d'argent (MAD) ?");
		
		int montant = scanner.nextInt();
		int reste = montant / 4;
		int fleur = montant % 4;
		// quand on divise par 3, si il ya reste l'ajout a fleur prix;
		fleur += reste % 3;
		//System.out.println(reste);
		int numCafe, numRecharge, numTrame;
		numCafe = numRecharge = numTrame = 0;
		int cafe = 10;
		int recharge = 10;
		int trame = 8;
		
		int sum = cafe + recharge + trame;
		int i = 0;

		
		if (reste < sum) {
			System.out.println("il vous restera " + reste + "MAD pour les roses blanches");
		}

		// la somme de cafés
		int temp = reste / 3;
		// calculer le numéro de cafés et recharges; 
		while (temp >= cafe) {
			numCafe++;
			numRecharge++;
			temp -= cafe;

		}

		fleur += (temp * 2);

		// la some de trame
		temp = reste / 3;
		// calcule le numéro de trame ticket
		while (temp >= recharge) {
			numTrame++;
			temp -= 8;
		}
		fleur += temp;

			
		System.out.println("vous pouvez acheter");

		System.out.println(numCafe + " cafés");
		System.out.println(numRecharge + " Carte de recharge prépayer");
		System.out.println(numTrame + " billets de TRAME");
		System.out.println("il vous restera " + fleur + " MAD pour les roses");
		}


		//affichage 
		//Exemple d’exécution 
		// Combien avez-vous reçu d'argent (MAD)? 800 
//Livre et Fournitures : 600 MAD
//Vous pouvez ensuite acheter :
//6 cafés
//6 Carte de recharge prépayer
//8 billets de TRAME
//et il vous restera 16 MAD pour les roses blanches.

		//compléter le code 
		
		

		

}

