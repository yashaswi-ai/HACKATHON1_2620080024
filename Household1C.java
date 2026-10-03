 
import java.util.Scanner;
 class Household1C {
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter morning Usage");
        int morningUsage = sc.nextInt();
        System.out.println(" Enter evening Usage");
        int eveningUsage = sc.nextInt();
        int totalUsage = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total Usage: " + totalUsage);
        sc.close();
    }
    }
