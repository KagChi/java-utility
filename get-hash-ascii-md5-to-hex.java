import java.security.MessageDigest;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;

public class GetHashAsciiMd5ToHex {
    public static void main(String args[]) throws NoSuchAlgorithmException, UnsupportedEncodingException {
      MessageDigest md = MessageDigest.getInstance("MD5");
      md.update("711344422".getBytes("ascii"));
      String hex = String.format("%032X", new BigInteger(1, md.digest()));

      System.out.println(hex.toLowerCase());
    }
}
