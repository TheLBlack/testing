package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Comparator<String> comparator = (s1, s2) -> s2.compareToIgnoreCase(s1);

        List<String> list = new ArrayList<String>(List.of("A", "B", "C", "a", "b", "c"));
        Collections.sort(list, comparator);
    }

    // List: c, b, a
    public static List<String> sortDescending(List<String> strings) {
        for (int i = 0; i < strings.size() - 1; i++) { // i = 1
            for (int j = i + 1; j < strings.size(); j++) { // j = 2
                if (strings.get(i).compareToIgnoreCase(strings.get(j)) < 0) {
                    // swap the elements at indices i and j
                    String temp = strings.get(i);
                    strings.set(i, strings.get(j));
                    strings.set(j, temp);
                }
            }
        }

        return strings;
    }
}