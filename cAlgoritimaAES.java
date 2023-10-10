import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;

public class AlgoritimoA {

    public static void main(String[] args) throws Exception {
        String mensagem = "Este é um exemplo";

        //Gerador de chaves
        KeyGenerator Kgen = KeyGenerator.getInstance("AES");
        Kgen.init(256);

        //Gera a chave secreta
        SecretKey skey = kgen.generateKey();
        byte[] raw = skey.getEncoded();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES")

        //Inicia a criptografia
        Cipher cifra = Cipher.getInstance("AES");
        cifra.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] dadosEncriptados = cifra.doFinal(mensagem.getBytes());

        //Inicia a decriptografia
        cifra.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] dadosDecriptados = cifra.doFinal(dadosEncriptados);
        String originalString = new String(dadosDecriptados)
        System.out.println("Palavra Original: " + originalString)
    }
}
