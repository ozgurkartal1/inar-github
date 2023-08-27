package week_04.live_class;

import java.util.Scanner;

public class TheClosestPlace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min;

        System.out.print("Enter gym1 x coordinate : ");
        int gym1 = input.nextInt();

        System.out.print("Enter gym2 x coordinate : ");
        int gym2 = input.nextInt();

        System.out.print("Enter gym3 x coordinate : ");
        int gym3 = input.nextInt();

        int distanceGym1 = Math.abs(gym1);
        int distanceGym2 = Math.abs(gym2);
        int distanceGym3 = Math.abs(gym3);

        int tempMin = Math.min(distanceGym1, distanceGym2);
        min = Math.min(tempMin, distanceGym3);

        if(distanceGym1 == min){
            System.out.printf("The closest gym is gym1 at %d\n", gym1);
        }else if(distanceGym2 == min){

                System.out.printf("The closest gym is gym2 at %d\n", gym2);
        }else{
            System.out.printf("The closest gym is gym3 at %d\n", gym3);
        }


       // Finding The Cheapest Gym.

        final double OIL_COST_PER_KILOMETER = 0.5;
        double minCost;
        double gymCost1 = 3;
        double gymCost2 = 10;
        double gymCost3 = 5;


        double totalCost1 = gymCost1 + OIL_COST_PER_KILOMETER * distanceGym1;
        double totalCost2 = gymCost2 + OIL_COST_PER_KILOMETER * distanceGym2;
        double totalCost3 = gymCost3 + OIL_COST_PER_KILOMETER * distanceGym3;

        double tempMinCost = Math.min(totalCost1, totalCost2);
        minCost = Math.min(tempMinCost, totalCost3);

        if(minCost == totalCost1){
            System.out.printf("The total cost is $%3.1f. The cheapest gym for total cost is gym1\n", totalCost1);
        }else if (minCost == totalCost2){
            System.out.printf("The total cost is $%3.1f. The cheapest gym for total cost is gym2\n",totalCost2);
        }else{
            System.out.printf("The total cost is $%3.1f. The cheapest gym for total cost is gym3\n",totalCost3);
        }


    }
}
