import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ReplaseSomeWords {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        String kbInput = scanner.nextLine();
        ArrayList <String> words =new ArrayList<String>( Arrays.asList( kbInput.split( "\\s")));
        int i = words.indexOf("бяка");
        words.set( i,"Вырезано цензурой" );
        for ( String subStr : words ) {
            System.out.print(subStr);
        }
    }
    }
