package workhome4;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String[] words = {"alena", "andrei", "petya", "sasha",
                "andrei", "pasha", "jenya", "olga", "andrei",
                "stepan", "ivan", "ivan", "nastya"};

        List<String> wordsList = Arrays.asList(words);
        Map<String, Integer> result = new HashMap<>();

        for (String word : wordsList) {
            result.put(word, Collections.frequency(wordsList, word));
        }

        result = new HashMap<>();
        for (String word : wordsList) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
                continue;
            }
            result.put(word, 1);
        }

        System.out.println(result);

    PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhoneNumber("Ваня", "123");
        phoneBook.addPhoneNumber("Петя", "456");
        phoneBook.addPhoneNumber("Петя", "7777778");
        phoneBook.addPhoneNumber("Сережа", "7777778");

        System.out.println(phoneBook.get("Ваня"));
        System.out.println(phoneBook.get("Петя"));
        System.out.println(phoneBook.get("Петр"));
}
}
