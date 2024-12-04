import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main (String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for (int i=0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if (i == dataPoints.length - 1) {

                System.out.print(dataPoints[1]);
            } else {
                System.out.print(dataPoints[i] + " | ");
            }
        }

        System.out.println();

        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[1];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the values is: " + sum);
        System.out.println("The average of the values is: " + average);

        Scanner pipe = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(pipe, "Enter a value between 1 & 100", 1, 100);

       int count = 0;
       for (int i = 0; i < dataPoints.length; i++) {
           if (dataPoints[i] == userValue) {
               count++;
           }
       }

       if (count > 0) {
           System.out.println("the value " + userValue + " was found " + count + " times in the array");
       } else {
           System.out.println("the value " + userValue + " was not found in the array");
       }

       int userValue2 = SafeInput.getRangedInt(pipe, "Enter another value between 1 & 100",1,100);
       boolean found = false;
       for (int i = 0; i < dataPoints.length; i++) {
           if (dataPoints[i] == userValue2) {
               System.out.println("the value " + userValue2 + " was found in the array index at " + i + ".");
               found = true;
               break;
           }
       }
       if (!found) {
           System.out.println("the value " + userValue2 + " was not found in the array");
       }

       int min = dataPoints[0];
       int max = dataPoints[0];

       for (int i = 1; i < dataPoints.length; i++) {
           if (dataPoints[i] < min) {
               min = dataPoints[i];
           }

           if (dataPoints[i] > max) {
               max = dataPoints[i];
           }
       }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        System.out.println("the average of the data pointsis: " + SafeInput.getAverage(dataPoints));
    }
}