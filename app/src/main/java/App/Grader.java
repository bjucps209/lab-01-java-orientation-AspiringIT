package app;

import java.io.*;

public class Grader {

    public static void main(String[] args) {
        new Grader();
    }
    public Grader() {
        //Pass in file
        try {
            FileIO();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void FileIO() throws FileNotFoundException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("grades.txt"));
            System.out.println(reader.readLine());
            reader.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int NoRoundGrade(int grade) {
        return grade;
    }

    public static int roundGrade(int grade) {
        return grade;
    }
}
