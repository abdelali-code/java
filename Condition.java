package src;
import java.util.*;

public class Condition {

	public static void main(String[] args) {
		String is_remise;
		float remise = 0;
		double montant;
		Scanner sc = new Scanner(System.in); 
		System.out.print("entrer le montant Ht: ");
		montant = sc.nextDouble();
		// to consume the new line;
		sc.nextLine();
 		System.out.print("avec remise (oui, non) ?: "); 
 		is_remise = sc.nextLine();
 	    // to consume the new line;
 		//sc.nextLine();
 		is_remise = is_remise.toLowerCase();
 		//is_remise = is_remise.replace("\n", "");
 
 		if (is_remise.equals("oui") || is_remise.equals("yes")) {
 			System.out.print("remise value : "); 
 			remise = sc.nextFloat();
 			montant = montant - (montant * remise);
 		}
 		
 		// calcule montant ttc
 		System.out.println(montant + (montant * 0.2) + " TTC");
	}

}

