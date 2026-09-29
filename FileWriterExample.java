import java.io.*;

class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt");

            for (char i = 65; i <= 90; i++) {
                fw.write(i);
            }

            fw.close();

            System.out.println("Data written successfully.");
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
