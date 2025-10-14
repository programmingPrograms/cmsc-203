import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

    @Test
    void testCaesarEncryption() {
        String enc = CryptoManager.caesarEncryption("HELLO", 3);
        assertEquals("KHOOR", enc); // shift each letter by 3
    }

    @Test
    void testCaesarDecryption() {
        String dec = CryptoManager.caesarDecryption("KHOOR", 3);
        assertEquals("HELLO", dec);
    }

    @Test
    void testOutOfBounds() {
        String result = CryptoManager.caesarEncryption("hello", 3); // lowercase not allowed
        assertEquals("The selected string is not in bounds, Try again.", result);
    }

    @Test
    void testVigenereRoundTrip() {
        String enc = CryptoManager.vigenereEncryption("TESTING", "KEY");
        String dec = CryptoManager.vigenereDecryption(enc, "KEY");
        assertEquals("TESTING", dec);
    }
}
