package src;

public class Boucle {

	public static void main(String[] args) {
		// exircice 1
		int i = 0;
		System.out.println("\n exircice 1 début ");
		while (i < 10) {
			System.out.print(i + "  ");
			i++;
		}
		System.out.println("\n exircice 1 fin ");
		
		// exircice 2;
		int a, b;
		
		a = 1;
		b = 50;
		System.out.println("\n exircice 2 début ");
		while (a <= 30) {
			System.out.print((a * b) + " ");
			a++;
		}
		System.out.println("\nexircice 2 fin ");
		// exercice 3
		
		float c = 1;
		System.out.println("\n exircice 3 début ");
		while (c < 10) {
			System.out.print(c + "  ");
			c = c + (c / 2);
		}
		System.out.println("\n exircice 3 fin ");
		
		
		// exircice 4
		System.out.println("\n exircice 4 début ");
		for (int j = 1; j < 15; j++) 
			System.out.println("On y arrive presque.. ");
		System.out.println("\n exircice 4 fin ");
		
		
		// exircice 5
		System.out.println("\n exircice 5 début ");
		for (i = 20; i >= 0; i--) 
			System.out.println("C'est presque bon... ");
		System.out.println("\n exircice 5 fin ");
		
		
		// exircice 6
		System.out.println("\n exircice 6 début ");
		for (i = 1; i < 100; i = i + 15) 
			System.out.println("On tient le bon bout... ");
		System.out.println("\n exircice 6 fin ");
		
		// exircice 7
		System.out.println("\n exircice 7 début ");
		for (i = 200; i > 0; i = i - 12) 
			System.out.println("Enfin ! ! !");
		System.out.println("\n exircice 7 fin ");
	}
	

}

