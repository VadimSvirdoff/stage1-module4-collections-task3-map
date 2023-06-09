package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordRepetitionMap.put(word, wordRepetitionMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordRepetitionMap;
    }
}
