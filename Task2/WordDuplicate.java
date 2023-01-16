package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordDuplicate {

    static List doubleValues(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String elem : list) {
            newList.add(elem);
            newList.add(elem);
        }
        return newList;
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            myList.add(sc.nextLine());

        }
        List<String> listForPrinting = new ArrayList<>(WordDuplicate.doubleValues(myList));
        for (String s : listForPrinting) {
            System.out.println(s);


        }
    }
}
