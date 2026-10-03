import java.util.*;
public class Household {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int familyMembers = sc.nextInt();
        double waterConsumed = sc.nextDouble();
        int houseNumber = sc.nextInt();
        char waterUsageStatus = sc.next().charAt(0);
        System.out.println(" Number of Family Members: " + familyMembers);
        System.out.println(" Water Consumed: " + waterConsumed);
        System.out.println(" House Number: " + houseNumber);
        System.out.println(" Water Usage Status: " + waterUsageStatus);
    }
}
