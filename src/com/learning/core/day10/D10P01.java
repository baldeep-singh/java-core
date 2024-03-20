package com.learning.core.day10;
import java.io.*;

public class D10P01{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <sourceFile> <destinationFile>");
            return;
        }

        String sourcePath = args[0];
        String destinationPath = args[1];

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try {
            if (destinationFile.exists()) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Destination file already exists. Do you want to overwrite it? (yes/no): ");
                String choice = reader.readLine().trim().toLowerCase();
                if (!choice.equals("yes")) {
                    System.out.println("Operation aborted.");
                    return;
                }
            } else {
                destinationFile.createNewFile();
            }

         
            InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(destinationFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
