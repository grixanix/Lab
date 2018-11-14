
// 2 Реализовать вывод информации из файла на экран

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("/Users/grigorii555/Desktop/Без названия.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
