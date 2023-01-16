package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringsUntillEnd {

    static List<String> strList = new ArrayList<>();

    static List<String> listFill(String str) {
        strList.add(str);
        return strList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stopWord = "end";
        String str;
        while (true) {
            System.out.println("Enter string: ");
            str = sc.nextLine();
            if (str.equals(stopWord)) {
                break;
            } else {
                strList = listFill(str);
            }

        }
        for (String elem : strList) {
            System.out.println(elem);
        }
    }
}
