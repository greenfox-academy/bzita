public class Exercise5 {
    public static void main (String [] args){

        // 13 SecondsInADay

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int remainingSeconds;

        remainingSeconds = ((24 - currentHours) * 3600) + ((60 - currentMinutes) * 60) + (60 - currentSeconds);
        System.out.println(remainingSeconds);

    }
}
