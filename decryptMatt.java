public class decryptMatt {

    public String ShiftRight(String str, int shift) {
        while (shift < 0) shift += 26;
        String encodedString = "";      // Empty string is declared. This is the location of the decrpyted text

        for (int i = 0; i < str.length(); i++) {            // For loop is iterated for every character in the encypted text
            encodedString += Encrypt(str.charAt(i), shift); // Each character id decypted and added to the empty string. This will form the text in its decrpyted format
        }

        return encodedString;
    }

    private char Encrypt(char ch, int shift) {
        char aah = '-';
        if (ch >= 'a' && ch <= 'z') 
            aah = 'a';
        else if (ch >= 'A' && ch <= 'Z') 
            aah = 'A';
        else
            return ch;

        return (char) ((ch - aah + shift) % 26 + aah);
    }
} 