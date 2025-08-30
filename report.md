
time worked
1hr 8-28
2.5hrs of setting up enviroment and going through supplemental material
1hr 8-29
4hr 8-29

# Lab 1 Report

Nicholas Weist  
CpS 209  
August 29, 2025

Time spent: 6 hours (Not including setting up prerequisites)

## Work Completed

I certify that I completed all steps in the lab using my own computer.

## Known Issues

* In order to pass grades.txt to Grader.java in Task C you must navigate in the terminal to 
```bash
  \lab-01-java-orientation-AspiringIT\app\src\main\java\app 
```
only then can you run 
```bash 
   cat grades.txt | java Grader.java
```
## Transcripts

### Task A: Warm Up
```console

CPS D:\CpS 209 Coding Projects\Labs\lab-01-java-orientation-AspiringIT> cd .\app\src\main\java\app\
PS D:\CpS 209 Coding Projects\Labs\lab-01-java-orientation-AspiringIT\app\src\main\java\app> java Hello.java            
3
4
The sum is: 7
```

### Task B: Convert a Python Program
```console
 PS D:\CpS 209 Coding Projects\Labs\lab-01-java-orientation-AspiringIT\app\src\main\java\app> java Guess.java 
Enter your guess: 

4
Your guess is too low

Enter your guess: 

9
Your guess is too high

Enter your guess: 

7
Your guess is too high

Enter your guess:

5
Your guess is too low

Enter your guess:

6
You got it!

It took you 5 guesses
```

### Task C: Solve a Problem
```console
PS D:\CpS 209 Coding Projects\Labs\lab-01-java-orientation-AspiringIT\app\src\main\java\app> cat grades.txt | Java Grader.java
75
67
40
33
```