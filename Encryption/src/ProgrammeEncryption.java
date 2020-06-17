import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgrammeEncryption {

	public static void main(String[] args) {
			// déclaration de la clé d'enregitrement secrète
			String cle_de_chiffrement = "bibiz9944x";
			
			// encryption du texte
			String texte_apres_encryption = Securite.encrypter("Les carottes sont cuites!", cle_de_chiffrement);
			System.out.println(texte_apres_encryption);
	
			// décryption du texte
			String texte_apres_decryption =  Securite.decrypter(texte_apres_encryption,cle_de_chiffrement);
			System.out.println(texte_apres_decryption);
		}
}
