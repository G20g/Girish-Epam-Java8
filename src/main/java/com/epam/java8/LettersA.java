package com.epam.java8;

import java.util.*;
import java.util.stream.Collectors;

public class LettersA {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("aqs");
        list.add("arstu");
        list.add("air");
        list.add("aaa");
        list.add("girish");
        list.add("aga");

        list = findStrings(list);

        for (String str : list)
            System.out.println(str);
    }

    static List<String> findStrings(List<String> list) {
        return list.stream().filter(str -> str.startsWith("a")).filter(str -> str.length() == 3)
                .collect(Collectors.toList());
    }

}