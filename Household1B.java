import java.util.*;
public class Household1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double waterConsumption = sc.nextDouble();
        if(waterConsumption < 500) {
            System.out.println(" Bill is Rs.100");
        } else { 
            System.out.println(" Bill is Rs.200");
        }
    }
    
}
