import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Sport[] sports = new Sport[3];
        Load load = new Load();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Sport sport;


        for (int i = 0; i < sports.length; i++) {
           sport = load.LoadOfSport();
           boolean good = false;
                for (int j = 0; j < i ; j++) {
                    if(good == false) {
                        if (sport.equals(sports[j])) {
                            System.out.println("Podane dane już się pojawiły. Podaj ponownie dane.");
                            good = true;
                        }
                    }
                }
            if(good == false){
                sports[i] = sport;
            }else{
                i--;
            }
        }

        for (int i = 0; i <sports.length ; i++) {
            System.out.println(sports[i].toString());
        }


    }
}
