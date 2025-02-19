public class Sample1 {
    
    // Method to encrypt the text using the given shift value
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);
            
            // Encrypt uppercase characters
            if (Character.isUpperCase(charAt)) {
                char ch = (char)(((int)charAt + shift - 65) % 26 + 65);
                result.append(ch);
            } 
            // Encrypt lowercase characters
            else if (Character.isLowerCase(charAt)) {
                char ch = (char)(((int)charAt + shift - 97) % 26 + 97);
                result.append(ch);
            } 
            // Leave non-alphabet characters unchanged
            else {
                result.append(charAt);
            }
        }
        
        return result.toString();
    }
    
    // Method to decrypt the text using the given shift value
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        String plaintext = "HELLO";
        int shift = 3;
        
        String ciphertext = encrypt(plaintext, shift);
        System.out.println("Encrypted: " + ciphertext);
        
        String decryptedText = decrypt(ciphertext, shift);
        System.out.println("Decrypted: " + decryptedText);
    }
}
