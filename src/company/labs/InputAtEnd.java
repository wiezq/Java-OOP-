package labs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputAtEnd {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String filePath = "C:/Users/ivanm/IdeaProjects/Java-POOP/src/company/labs/text.txt";
        System.out.println("Введите строку чтобы записать в конец файла");
        String text = sc.nextLine() + "\n";

        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}