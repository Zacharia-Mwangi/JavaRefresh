package Input_Output;

import java.io.*;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String [] args){
        final String FILE_NAME = "/home/zack/Desktop/PracJava";

        try{
            // 1st Way
            System.out.println("-- Using Scanner --");
            Scanner scanner = new Scanner(new FileInputStream(FILE_NAME));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("-- Using BufferedReader --");
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME)));
            try {
                String line = bufferedReader.readLine();
                while(line != null){
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }
            } catch (IOException io){
                io.printStackTrace();
            }



        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
