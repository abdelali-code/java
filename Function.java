package src;

public class Function {

	// exircice 1
	public boolean bool() {
		return true;
	}

	// return string
	// exercice 2
	public String return_string(String a) {
		return a;
	}

	// contactenate string
	// exercice 3
	public String concatnate_a_b(String a, String b) {
		return a + b;
	}

	// exercice 4
	public String whoBigger(int a, int b) {
		if (a > b)
			return "Le premier nombre est plus grand";
		else if (a < b)
			return "Le premier nombre est plus petit";
		else
			return "Les deux nombres sont identiques";
	}

	// exeercice 5
	public String contatenate_str_int(int a, String b) {
		return a + b;
	}

	// exercice 6
	public String who_are_you(String nom, String prenom, int age) {
		return "Bonjour " + nom + " " + prenom + ", tu as " + age + " ans.";
	}
	// exercice 7
	public String is_majour(int age, String genre) {
		genre = genre.toLowerCase();
		// if genre does not match homme or femme
		if (!genre.equals("homme") && !genre.equals("femme")) return "NaH";
		// age > 18 ans
		if (age >= 18) {
			return "Vous êtes un " + genre + " et vous êtes majeur";
		}
		// age > 0
		else if (age > 0) return "Vous êtes un " + genre + " et vous êtes mineru";
		// if age < 0;
		else return "Nah";
	}
	
	// exercice 8
	public int sum_of_3(int a, int b, int c) {
		return a + b + c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function test = new Function();
		System.out.println(test.sum_of_3(18, 20, 22));
	}

}

