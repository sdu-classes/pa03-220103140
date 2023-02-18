import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ReadFile {
    public static String[] readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        String[] lines = new String[1000];
        int lineCounter = 0;

        String line = null;
        while (sc.hasNextLine()){
            line = sc.nextLine();
            lines[lineCounter] = line;
            lineCounter++;
        }

        return lines;
    }
    public static void main(String[] args) {
        String filename = "Text.txt";
        try{
        String[] lines = readFile(filename);
        for(String line : lines){
            if(line == null)
                break;
            System.out.println(line);
        }
        }catch (FileNotFoundException exc){
            System.out.println(exc.getMessage());
        }

    }
}
