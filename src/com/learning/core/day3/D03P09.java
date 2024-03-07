package com.learning.core.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class D03P09 {public static boolean canFormCircle(ArrayList<String> strings) {
    boolean[] visited = new boolean[strings.size()];
  
    for(int i = 0; i < strings.size(); i++) {
        visited[i] = false;
    }
    

    for (int i = 0; i < strings.size(); i++) {
        visited[i] = true;
        if (dfs(strings, visited, strings.get(i), strings.get(i).charAt(0))) {
            return true;
        }
        visited[i] = false;
    }
    return false;
}


    public static boolean dfs(ArrayList<String> strings, boolean[] visited, String curr, char firstChar) {
        if (allVisited(visited)) {
            return true;
        }
        for (int i = 0; i < strings.size(); i++) {
            if (!visited[i]) {
                if (strings.get(i).charAt(0) == curr.charAt(curr.length() - 1)) {
                    visited[i] = true;
                    if (dfs(strings, visited, strings.get(i), firstChar)) {
                        return true;
                    }
                    visited[i] = false;
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean allVisited(boolean[] visited) {
        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Enter strings (press Enter to stop):");
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            strings.add(line);
        }
        scanner.close();
        if (canFormCircle(strings)) {
            System.out.println("Possible");
        } else {
            System.out.println("Not possible.");
        }
    }
}
