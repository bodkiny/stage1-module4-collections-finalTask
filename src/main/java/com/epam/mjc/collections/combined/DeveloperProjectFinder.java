package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        return projects.entrySet().stream()
                .filter(entry -> entry.getValue().contains(developer))
                .map(Map.Entry::getKey)
                .sorted((d1, d2) -> {
                    int lengthDiff = d2.length() - d1.length();
                    return lengthDiff != 0 ? lengthDiff : d2.compareTo(d1);
                })
                .collect(Collectors.toList());
    }
}
