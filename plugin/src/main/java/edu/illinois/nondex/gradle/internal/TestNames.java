package edu.illinois.nondex.gradle.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestNames {

    private final Map<String, Set<String>> map = new HashMap<>();

    public void add(String className, String testName) {
        map.computeIfAbsent(className, ignored -> new HashSet<>()).add(testName);
    }

    public void remove(String className, Predicate<? super String> predicate) {
        Set<String> testNames = map.get(className);
        if (testNames != null) {
            testNames.removeIf(predicate);
            if (testNames.isEmpty()) {
                map.remove(className);
            }
        }
    }

    public boolean remove(String className, String testName) {
        Set<String> testNames = map.get(className);
        if (testNames == null) {
            return false;
        } else {
            if (testNames.remove(testName)) {
                if (testNames.isEmpty()) {
                    map.remove(className);
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public Stream<Map.Entry<String, Set<String>>> stream() {
        return map.entrySet().stream();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public int size() {
        return stream().mapToInt(s -> s.getValue().size()).sum();
    }
}
