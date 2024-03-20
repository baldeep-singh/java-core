package com.learning.core.day10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class D10P04
{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopyExample <sourceFilePath> <destinationFilePath>");
            return;
        }

        String sourceFilePath = args[0];
        String destinationFilePath = args[1];

        Path sourcePath = Paths.get(sourceFilePath);
        Path destinationPath = Paths.get(destinationFilePath);

        try {
            
            Files.copy(sourcePath, destinationPath);

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}
