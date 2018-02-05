import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Sport[] sports = new Sport[3];
        Load load = new Load();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);


        for (int i = 0; i < sports.length; i++) {
            sports[i] = load.LoadOfSport();
            if((i >0 && sports[i].equals(sports[i-1])) || (i>1 && sports[i].equals(sports[i-2]))){
                System.out.println("Podałeś już takie dane. Podaj inne:");
                sports[i] = load.LoadOfSport();
            }
        }

        for (int i = 0; i <sports.length ; i++) {
            System.out.println(sports[i].toString());
        }


    }
}
