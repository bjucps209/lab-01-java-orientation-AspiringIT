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
            int NumStudents = Integer.parseInt(reader.readLine());
            String line;
            while ((line = reader.readLine()) != null) {
                roundGrade(Integer.parseInt(line));

            }
            reader.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static int roundGrade(int grade) {
        int remainder = grade % 5;
        if (remainder >= 3 && grade >40) {
            grade += 5 - remainder;
            System.out.println(grade);
        }
        else if (grade < 40){
            System.out.println(grade);

        }
        else {
            System.out.println(grade);
        }
        return grade;
    }
}
