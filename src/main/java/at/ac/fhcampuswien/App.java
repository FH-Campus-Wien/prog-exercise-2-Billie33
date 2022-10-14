package at.ac.fhcampuswien;

public class App {


import java.util.Scanner;



 public class App {
    public void main(String[] args) {

    }


    //todo Task 1
    public void largestNumber() {
        // input your solution here

        Scanner scan = new Scanner(System.in);
        int counter = 1;
        double input = 1;
        double maxval = 0;
        System.out.print("Number " + counter + ": ");
        counter++;
        input = scan.nextDouble();

        if (input <= 0) {
            System.out.println("No Number entered.");
        }
        while (input > 0) {
            System.out.print("Number " + counter++ + ": ");
            input = scan.nextDouble();

            if (input > maxval) {
                maxval = input;

            }
        }
        System.out.println("The largest number is " + String.format("%.2f", maxval));

    }

    //todo Task 2
    public void stairs() {
        // input your solution here

        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int maxzeilen = scan.nextInt();
        int counter = 1;

        if (maxzeilen < 0) {

            System.out.println("Invalid number!");

        }
        for (int i = 0; i < maxzeilen; i++) {

            for (int j = 0; j < maxzeilen; i++) {
                if (i >= j)

                    System.out.print(counter++ + " ");

            }
            System.out.println();


        }

    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here

        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            for (int j = i; j < rows; j++) {

                System.out.print("*");


            }
            System.out.println();

        }
    }


    //todo Task 4
    public void printRhombus(Object space) {
        // input your solution here

        Scanner in = new Scanner(System.in);

        // load parameters
        Scanner scan = new Scanner(System.in);

        System.out.print("h: ");
        int h = in.nextInt();
        h = scan.nextInt();
        System.out.print("c: ");
        char c = in.next().charAt(0);

        //validate parameters
        if (h % 2 == 0) {
            System.out.println("Invalid number!");
            return;
        }

        /*
         *The following lines of Code have been taken from the Internet | https://stackoverflow.com/questions/69681723/ , 14.10.2022
         */

        for (int i = 0; i <= h / 2; i++) {
            printSpaces((h + 1) / 2 - i - 1);
            printLine(c, i);
            System.out.println();

        }

        for (int i = h / 2 - 1; i >= 0; i--) {
            printSpaces((h + 1) / 2 - i - 1);
            printLine(c, i);
            System.out.println();
        }

    }

    private static void printLine(char character, int sideWidth) {
        for (int j = sideWidth; j >= 0; j--)
            System.out.print((char) (character - j));
        for (int j = 1; j <= sideWidth; j++)
            System.out.print((char) (character - j));

    }

    private static void printSpaces(int numberOfSpaces) {
        for (int i = 0; i < numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }


    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner scan = new Scanner(System.in);

        double mark = 1;
        int sum = 0;
        int counter = 0;
        double average = 0;
        int negative = 0;

        System.out.print("Mark " + ++counter + ": ");
        mark = scan.nextDouble();
        average += mark;

        while (mark > 0) {

            if (mark < 0 || mark > 5) {
                System.out.println("Invalid mark!");
                average -= mark;
                counter--;


            } else if (mark == 5) {
                negative += 1;
            }

            System.out.print("Mark " + ++counter + ": ");
            mark = scan.nextDouble();
            if (mark != 0) {
                average = (average + mark);
            }

        }
        if (average == 0) {
            System.out.printf("Average: %.2f", average);
            System.out.println();
            System.out.println("Negative marks: " + negative);
        }


        //todo Task 6
        public void happyNumbers () {
            // input your solution here
            int i = 1;
            int input;
            int sume = 0;

            System.out.print("n: ");
            scan = new Scanner(System.in);
            input = scan.nextInt();

            while (input > 9) {

                while (input > 0) {

                    i = input % 10;
                    sum += (i * i);
                    input = input / 10;
                }

                input = sum;
                sum = 0;
            }
            if (input == 1) {
                System.out.println("Happy numbers!:");
            } else {
                System.out.println("Sad numbers!");
            }
        }


        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus(space);

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
 }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
 }