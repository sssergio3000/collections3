package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Family> famList = new ArrayList<>();
        famList.add(new Family("Kiev", "Sasha"));
        famList.add(new Family("London", "Peter"));
        famList.add(new Family("Paris", "Anton"));
        famList.add(new Family("Kiev", "Anton"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city: ");
        String city = sc.nextLine();

        for (Family family : famList) {

            if (family.city.equals(city)) {
                System.out.println(family.surname);
            }

        }

    }
}
