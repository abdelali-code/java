import java.util.Scanner;
public class TanteFortunee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//demander à l'utilisateur d'entrer la somme d'argent
		System.out.print("Combien avez-vous reçu d'argent (MAD) ?");
		
		int montant = scanner.nextInt();
		int reste = montant / 4;
		System.out.println(reste);
		int numCafe, numRecharge, numTrame;
		numCafe = numRecharge = numTrame = 0;
		int cafe = 10;
		int recharge = 10;
		int trame = 8;
		int i = 0;
		
		if (reste < 28) {
			System.out.println("il vous restera " + reste + "MAD pour les roses blanches");
		}else {
			while (reste >= 28) {
				if (i == 4) {
					i = 0;
					numTrame++;
					reste -= 8;
				}
				else{	
					numCafe++;
					numRecharge++;
					numTrame++;
					reste -= 28;
					i++;
				}
			}
			if (reste >= 8 && (numCafe * 10) > (numTrame * numTrame)) {
				numTrame++;
				reste -= 8;
			}
			
			System.out.println("vous pouvez acheter");
			System.out.println(numCafe + "cafés");
			System.out.println(numRecharge + "Carte de recharge prépayer");
			System.out.println(numTrame + "billets de TRAME");
			System.out.println("il vous restera " + reste + "MAD pour les roses blanches");
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

}

