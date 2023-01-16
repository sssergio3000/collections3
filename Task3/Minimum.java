package Task3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Minimum {
    static List<Integer> list = new LinkedList<>();

    static List<Integer> getIntegerList(int num) {
        list.add(num);
        return list;
    }

    static int getMinimum(List<Integer> list) {

        Collections.sort(list);
//        System.out.println(list.get(0));
        return list.get(0);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter int: ");
            list = getIntegerList(sc.nextInt());
        }
        System.out.println(list);
        System.out.println(getMinimum(list));
    }
}

