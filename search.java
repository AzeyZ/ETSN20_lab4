import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class search {
    static Scanner file;
    static String pattern;
    public static void main(String[] args) {
        if(args.length == 2) {
            pattern = args[0];
            try {
                file = new Scanner(new File(args[1]));
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
            while(file.hasNextLine()) {
                String sentence = file.nextLine();

                if(sentence.toLowerCase().contains(pattern.toLowerCase()) {
                    System.out.println(sentence);
                }
            }
        } else if(args.length == 3) {
            if(args[2].equals("-hard")) {
                pattern = args[0];
                try {
                    file = new Scanner(new File(args[1]));
                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                }
                while(file.hasNextLine()) {
                    String sentence = file.nextLine();
                    if(Arrays.asList(sentence.split(" ")).contains(pattern)) {
                        System.out.println(sentence);
                    }
                }
            } else {
                System.out.println("Option doesn't exist");
                System.out.println("try -hard");
            }

        } else {
            System.out.println("Wrong arguments");
            System.out.println("* use as: search pattern file");
            System.out.println("OR");
            System.out.println("* use as: search pattern file option");
            System.out.println("* options can be -hard to only print when pattern is exactly present.");
        }
    }
}
