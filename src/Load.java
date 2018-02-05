import java.util.Locale;
import java.util.Scanner;

public class Load{

    public Sport LoadOfSport(){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        String name;
        String typeOfSport;
        int age;

        System.out.println("Twój ulubiony sportowiec: ");
        name = input.nextLine();
        System.out.println("Rodzaj sportu jaki uprawia: ");
        typeOfSport = input.nextLine();
        System.out.println("Wiek:");
        age = input.nextInt();
        input.nextLine();


        Sport sport = new Sport(name,typeOfSport,age);
        return sport;
    }


}
