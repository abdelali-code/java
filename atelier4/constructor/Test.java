package atelier4;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe empl1 = new Employe("ahmed", "mohamed", "safi", 2000);
		Employe empl2 = new Employe("mohamed", "ahmed", "youssuofia", 1990);
		empl1.afficherInfosClient();
		System.out.println(empl2.calculerAge());
	}
}

