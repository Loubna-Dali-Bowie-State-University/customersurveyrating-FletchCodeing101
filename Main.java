/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables that store each count for each rating (1 to 5)
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        
        // Variables for the total number of ratings and the sum of all ratings
        int totalRatings = 0;
        int sumRatings = 0;

        // Sentinel-controlled loop used to collect ratings from the user
        System.out.println("Enter ratings between 1 and 5 and (enter -1 to stop):");
        while (true) {
            int rating = scanner.nextInt(); 

            // Check if the input is the sentinel value (-1), and if so, exit the loop
            if (rating == -1) {
                break;
            }

            // Validate rating cheking if it is between 1 and 5
            if (rating >= 1 && rating <= 5) {
                totalRatings++;         // Increment total ratings count
                sumRatings += rating;   // Add the rating to the sum for calculating the average later

                // Count each rating and check for a rating of 5
                if (rating == 1) {
                    count1++;
                } else if (rating == 2) {
                    count2++;
                } else if (rating == 3) {
                    count3++;
                } else if (rating == 4) {
                    count4++;
                } else if (rating == 5) {
                    count5++;
                    System.out.println("Excellent rating score received."); // Immediate message for rating of 5
                }
            } else {
                // Show error message for invalid ratings outside the range
                System.out.println("Invalid rating. Enter a rating between 1 and 5.");
            }
        }

        // Calculate the average rating of valid input
        double averageRating = (totalRatings > 0) ? (double) sumRatings / totalRatings : 0.0;

        // Summary report with total ratings, average, and counts of each rating
        System.out.println("SUMMARY OF REPORT:");
        System.out.println("Total number of ratings: " + totalRatings);
        System.out.println("Average rating: " + averageRating);
        System.out.println("1-star ratings: " + count1);
        System.out.println("2-star ratings: " + count2);
        System.out.println("3-star ratings: " + count3);
        System.out.println("4-star ratings: " + count4);
        System.out.println("5-star ratings: " + count5);


        scanner.close();
    }
}