package labs_examples.input_output.labs;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */
class ReadFileDemo {
    public static void main(String[] args) {
        try (FileInputStream fileStream = new FileInputStream("src/labs_examples/input_output/files/DataInput.txt");
            BufferedInputStream buffStream = new BufferedInputStream(fileStream)) {

            byte[] buffer = new byte[10];
            int data = 0;
            while ((data = buffStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, data));
                //System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class WriteFileDemo {
    public static void main(String[] args) {
        try (FileOutputStream stream = new FileOutputStream("src/labs_examples/input_output/files/MyCatchPhrase.txt")) {

            String catchPhrase = "Learning I/O is prettying kool in Java";
            byte[] bytes = catchPhrase.getBytes(StandardCharsets.UTF_8);
            stream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ReadFile {
    public static void main(String[] args) {
        try (FileReader readFile = new FileReader("src/labs_examples/input_output/files/MyCatchPhrase.txt")) {

            int data;
            while ((data = readFile.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class WriteFile {
    public static void main(String[] args) {
        try (BufferedWriter writeFile = new BufferedWriter(new FileWriter("src/labs_examples/input_output/files/NewCatchPhrase.txt"))) {
            String text = "Learning Java Input Streams got me spinning";
            writeFile.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class DataOutputStreamDemo {
    public static void main(String[] args) {
        try (DataOutputStream dot = new DataOutputStream(new FileOutputStream("src/labs_examples/input_output/files/data.bin"))) {
            dot.writeDouble(6.04);
            dot.writeInt(850);
            dot.writeBoolean(true);
            dot.writeChars("1");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class DataInputStreamDemo {
    public static void main(String[] args) {
        try (DataInputStream din = new DataInputStream(new FileInputStream("src/labs_examples/input_output/files/data.bin"))) {
            double x = din.readDouble();
            int y = din.readInt();
            boolean b = din.readBoolean();
            char c = din.readChar();

            System.out.println("Values " + x + " " + y + " " + b + " " + c);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}