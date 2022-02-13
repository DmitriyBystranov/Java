package com.java.survival;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class Task_06 {
    public static void main(String[] args) {
        String str = " Hello World! ";

        Map<String, Integer> res = new HashMap<>();
        Stream<String> chars = Arrays.stream(str.split(""));
        chars.forEach(x -> {
            res.put(x, res.computeIfAbsent(x, v -> 0) + 1);
        });
        res.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);
    }
}
