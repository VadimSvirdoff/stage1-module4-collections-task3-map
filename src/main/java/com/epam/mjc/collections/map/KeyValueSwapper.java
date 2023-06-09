package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            // If the value already exists in the swapped map, map it to the smaller key value
            if (swappedMap.containsKey(value)) {
                Integer existingKey = swappedMap.get(value);
                if (key < existingKey) {
                    swappedMap.put(value, key);
                }
            } else {
                swappedMap.put(value, key);
            }
        }

        return swappedMap;
    }
}
