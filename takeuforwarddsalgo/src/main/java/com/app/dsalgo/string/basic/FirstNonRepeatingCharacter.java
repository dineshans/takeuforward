package com.app.dsalgo.string.basic;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// find first non repeating character -
// or also can return the index
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRepeatingCharacterUsingHashMap(s));
        nonRepeatingCharacterUsingJdk8(s);
    }

    // return index of first non repeating character
    // Using HashMap also we can do
    public static List<Integer> nonRepeatingCharacterUsingHashMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        List<Integer> resultList = new ArrayList<>();
        System.out.print("Non repeating characters are : ");
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                resultList.add(i);
                System.out.print(" " + str.charAt(i));
            }
        }
        System.out.println();
        return resultList;
    }

    public static void nonRepeatingCharacterUsingJdk8(String str) {

        Character ch =  str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);
        System.out.println("First non repeating character is : " + ch);

    }
}
