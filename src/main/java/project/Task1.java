package project;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

    }

    // List: c, b, a
    public static List<String> sortDescending(List<String> strings) {
        for (int i = 0; i < strings.size() - 1; i++) { // i = 1
            for (int j = i + 1; j < strings.size(); j++) { // j = 2
                if (strings.get(i).compareTo(strings.get(j)) < 0) {
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