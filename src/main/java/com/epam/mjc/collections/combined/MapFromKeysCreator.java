package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        sourceMap.forEach(
                (word, value) -> resultMap.computeIfAbsent(word.length(),
                        k -> new HashSet<>()).add(word));
        return resultMap;
    }
}
