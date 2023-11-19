package pwo.app;

/**
 * Główna klasa programu odpowiedzialna za uruchamianie aplikacji w zależności
 * od liczby przekazanych argumentów.
 *
 * @author Marcin
 * @version 1.0.0
 */
public class Sequence {

    /**
     * Metoda główna programu, uruchamiająca odpowiednią aplikację na podstawie
     * liczby argumentów.
     *
     * @param args Argumenty przekazane przy uruchamianiu programu.
     */
    public static void main(String[] args) {

     
        switch (args.length) {
            case 3 ->
                (new SeqToOutApp()).run(args);
            case 4 ->
                (new SeqToFileApp()).run(args);
            default ->
                System.out.println("""
                             !Illegal arguments
                             Legal usage: seqName from to [fileName]""");
        }
    }
}