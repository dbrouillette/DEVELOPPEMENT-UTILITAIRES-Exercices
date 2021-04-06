import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PC_Crasher {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int choix = 0;
		while(choix == 0){
			System.out.println("Bienvenue dans PC crasher 1.0.");
			System.out.println("");
			System.out.println("Comment voulez-vous planter l'ordinateur?");
			System.out.println("[1] Par le CPU");
			System.out.println("[2] Par la Mémoire");
			System.out.println("[3] Par le Disque");
			System.out.println("");
			System.out.print("Choix:");
			choix = sc.nextInt();
			
			switch (choix){
			case 1:
				CPU_Crasher();
				break;
			case 2:
				Memory_Crasher();
				break;
			case 3:
				Disk_Crasher();
				break;
			default:
				System.out.println("Choix invalide!");
				choix = 0;
				break;
			} 
		}
	}

	// méthode permettant de faire surchauffer le processeur
	private static void CPU_Crasher(){
		Random hazard = new Random();
		while(1==1)
		{
			long calcul_complexe = 0;
			calcul_complexe = 999999999 * 2 / 4 +12 + (5*22*22*2012) * hazard.nextLong();
			System.out.println(calcul_complexe);
		}
	}
	
	// méthode permettant de prendre beaucoup de mémoire
	private static void Memory_Crasher(){
		ArrayList liste = new ArrayList();
		while(1==1)
		{
			byte[] memoire = new byte[1024];
			liste.add(memoire);
			System.out.println("bip...");
		}
		
	}

	// méthode permettant de générer un très gros fichier!
	private static void Disk_Crasher() throws Exception{
		PrintWriter fichier;
			fichier = new PrintWriter("boom.txt", "UTF-8");
		while(1==1){
			fichier.println("La carte mère est le cœur de tout ordinateur compatible PC. ...");
			System.out.println("bip...");
		}
	}
}

















