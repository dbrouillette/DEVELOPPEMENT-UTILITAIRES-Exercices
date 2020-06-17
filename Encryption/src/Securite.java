import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Securite {
	private static SecretKeySpec cle_secrete;
	private static byte[] cle;

	public static void setCle(String nouvelle_cle) throws Exception {
		MessageDigest sha = null;
			cle = nouvelle_cle.getBytes("UTF-8");
			sha = MessageDigest.getInstance("SHA-1");
			cle = sha.digest(cle);
			cle = Arrays.copyOf(cle, 16);
			cle_secrete = new SecretKeySpec(cle, "AES");
	}

	public static String encrypter(String texte_a_encrypter, String code_secret) {
		try {
			setCle(code_secret);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, cle_secrete);
			return Base64.getEncoder().encodeToString(cipher.doFinal(texte_a_encrypter.getBytes("UTF-8")));
		} catch (Exception e) {
			System.out.println("Erreur d'encryption: " + e.toString());
		}
		return null;
	}

	public static String decrypter(String texte_a_decrypter, String code_secret) {
		try {
			setCle(code_secret);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, cle_secrete);
			return new String(cipher.doFinal(Base64.getDecoder().decode(texte_a_decrypter)));
		} catch (Exception e) {
			System.out.println("Erreur de decryption: " + e.toString());
		}
		return null;
	}
}
