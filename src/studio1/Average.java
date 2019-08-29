package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);

        int n1 = ap.nextInt("Pick a number you'd like to be averaged, please");
        int n2 = ap.nextInt("Let's have another number, guy");

        double average = ((double)n1 + (double)n2)/2;
        System.out.println(average);




    }

}
