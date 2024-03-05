package com.learning.core.day3;
import java.util.*;

public class D03P09 {
    public static void main(String[] args) {
        String[] words = {"abc", "cd", "def", "gha"};

        if (canFormCircle(words)) {
            System.out.println("The given strings can be chained to form a circle.");
        } else {
            System.out.println("The given strings cannot be chained to form a circle.");
        }
    }

    public static boolean canFormCircle(String[] words) {
        Map<Character, List<String>> graph = buildGraph(words);
        Set<String> visited = new HashSet<>();

        for (String word : words) {
            if (dfs(word, word, graph, visited)) {
                return true;
            }
        }

        return false;
    }

    private static Map<Character, List<String>> buildGraph(String[] words) {
        Map<Character, List<String>> graph = new HashMap<>();

        for (String word : words) {
            char startChar = word.charAt(0);
            char endChar = word.charAt(word.length() - 1);
            if (!graph.containsKey(startChar)) {
                graph.put(startChar, new ArrayList<>());
            }
            graph.get(startChar).add(word);
            // Initialize nodes that have no outgoing edges
            if (!graph.containsKey(endChar)) {
                graph.put(endChar, new ArrayList<>());
            }
        }

        return graph;
    }

    private static boolean dfs(String startWord, String currentWord, Map<Character, List<String>> graph, Set<String> visited) {
        char endChar = currentWord.charAt(currentWord.length() - 1);

        if (!graph.containsKey(endChar)) {
            return false;
        }

        List<String> nextWords = graph.get(endChar);
        for (String nextWord : nextWords) {
            if (!visited.contains(nextWord)) {
                visited.add(nextWord);
                if (startWord.equals(nextWord) || dfs(startWord, nextWord, graph, visited)) {
                    return true;
                }
                visited.remove(nextWord);
            }
        }

        return false;
    }
}
