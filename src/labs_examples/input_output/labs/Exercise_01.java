package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        String dataIn = "src/labs_examples/input_output/files/DataInput.txt";
        String dataOut = "src/labs_examples/input_output/files/DataOutput.txt";

        try (BufferedInputStream bufInStr = new BufferedInputStream(new FileInputStream(dataIn));
            BufferedOutputStream bufOuStr = new BufferedOutputStream(new FileOutputStream(dataOut))) {

            byte[] buffer = new byte[5];
            int bytesRead;

            while ((bytesRead = bufInStr.read(buffer)) != -1) {
                bufOuStr.write(buffer, 0, bytesRead);
            }
        } catch (IOException exc) {
                exc.printStackTrace();
        }
    }
}