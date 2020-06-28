package com.epam.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String args[]) {
        List<String> arrayList = new ArrayList();
        arrayList.add("civic");
        arrayList.add("girish");
        arrayList.add("level");
        arrayList.add("Racecar");
        arrayList.add("hello");

        arrayList = palindrome(arrayList);

        System.out.println("Palindrome Strings are ->");
        for (String str : arrayList)
            System.out.println(str);
    }

    static List<String> palindrome(List<String> list) {
        List<String> arrayList = new ArrayList();
        for (String i : list) {
            String str = i.replaceAll("\\s+", "").toLowerCase();
            if (IntStream.range(0, str.length() / 2).noneMatch(j -> str.charAt(j) != str.charAt(str.length() - j - 1)))
                arrayList.add(i);
        }
        return arrayList;
    }

}