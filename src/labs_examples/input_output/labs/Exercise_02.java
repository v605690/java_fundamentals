package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.
 * <p>
 * Then, ead back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?
 */

class FileEncryption {
    public static void main(String[] args) {

        String dataIn = "src/labs_examples/input_output/files/DataInput.txt";
        String encryptedFile = "src/labs_examples/input_output/files/encrpted.txt";
        String decryptedFile = "src/labs_examples/input_output/files/decrypted.txt";
        int key = 1;

        try {
            encryptFile(dataIn, encryptedFile, key);
            decryptFile(encryptedFile, decryptedFile, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void encryptFile(String dataIn, String fileout, int key) {
        try (BufferedReader br = new BufferedReader(new FileReader(dataIn));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileout))) {

            int charInt;
            while ((charInt = br.read()) != -1) {
               char encryptChar = (char) (charInt + key);
                bw.write(encryptChar);
                //System.out.print(encryptChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void decryptFile(String dataIn, String fileout, int key) {
        try (BufferedReader br = new BufferedReader(new FileReader(dataIn));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileout))) {

            int charInt;
            while ((charInt = br.read()) != -1) {
                char decryptChar = (char) (charInt - key);
                bw.write(decryptChar);
                //System.out.print(charInt);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
