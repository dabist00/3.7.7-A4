import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;  


public class PokemonRunner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:/Users/P4/Desktop/CSA Work Documents/PLTW Stuff/3.7.7-A4/pokemon.csv"));
        in.useDelimiter(",");
        
        while (in.hasNextLine()){
            // String[] line = in.nextLine().split();
            System.out.println(in.next());
        }
    }
}
