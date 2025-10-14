/**
 * Utility class that encrypts and decrypts a phrase using three approaches:
 * Vigenere, Playfair (8x8), and Caesar.
 * CMSC203 – Assignment 3
 */
public class CryptoManager {

    // Character bounds used by the assignment/tests (space..underscore)
    private static final char LOWER_RANGE = ' ';   // 32
    private static final char UPPER_RANGE = '_';   // 95
    private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

    // 64-character alphabet used for Playfair (8x8). Keep as provided.
    @SuppressWarnings("unused")
    private static final String ALPHABET64 =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_";

    // ---------- Helpers ----------
    public static boolean isStringInBounds(String text) {
        if (text == null) return false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch < LOWER_RANGE || ch > UPPER_RANGE) return false;
        }
        return true;
    }

    private static int mod(int x, int m) {
        int r = x % m;
        return (r < 0) ? r + m : r;
    }

    private static String outOfBoundsMsg() {
        return "The selected string is not in bounds, Try again.";
    }

    // ---------- Caesar ----------
    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) return outOfBoundsMsg();
        int shift = mod(key, RANGE);
        StringBuilder sb = new StringBuilder(plainText.length());
        for (int i = 0; i < plainText.length(); i++) {
            int off = plainText.charAt(i) - LOWER_RANGE;
            int enc = (off + shift) % RANGE;
            sb.append((char) (enc + LOWER_RANGE));
        }
        return sb.toString();
    }

    public static String caesarDecryption(String encryptedText, int key) {
        if (!isStringInBounds(encryptedText)) return outOfBoundsMsg();
        return caesarEncryption(encryptedText, -key);
    }

    // ---------- Vigenere ----------
    public static String vigenereEncryption(String plainText, String key) {
        if (!isStringInBounds(plainText) || !isStringInBounds(key) || key.isEmpty())
            return outOfBoundsMsg();

        StringBuilder sb = new StringBuilder(plainText.length());
        for (int i = 0; i < plainText.length(); i++) {
            int kShift = (key.charAt(i % key.length()) - LOWER_RANGE) % RANGE;
            int off = plainText.charAt(i) - LOWER_RANGE;
            int enc = (off + kShift) % RANGE;
            sb.append((char) (enc + LOWER_RANGE));
        }
        return sb.toString();
    }

    public static String vigenereDecryption(String encryptedText, String key) {
        if (!isStringInBounds(encryptedText) || !isStringInBounds(key) || key.isEmpty())
            return outOfBoundsMsg();

        StringBuilder sb = new StringBuilder(encryptedText.length());
        for (int i = 0; i < encryptedText.length(); i++) {
            int kShift = (key.charAt(i % key.length()) - LOWER_RANGE) % RANGE;
            int off = encryptedText.charAt(i) - LOWER_RANGE;
            int dec = mod(off - kShift, RANGE);
            sb.append((char) (dec + LOWER_RANGE));
        }
        return sb.toString();
    }

    // ---------- Playfair (placeholders so file compiles; we’ll implement next) ----------
    public static String playfairEncryption(String plainText, String key) {
        if (!isStringInBounds(plainText) || !isStringInBounds(key) || key.isEmpty())
            return outOfBoundsMsg();
        // TODO: implement 8x8 Playfair
        return plainText; // placeholder
    }

    public static String playfairDecryption(String encryptedText, String key) {
        if (!isStringInBounds(encryptedText) || !isStringInBounds(key) || key.isEmpty())
            return outOfBoundsMsg();
        // TODO: implement 8x8 Playfair
        return encryptedText; // placeholder
    }
}
