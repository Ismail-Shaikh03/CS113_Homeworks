import java.util.*;

public class TestExceptionsV1  {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of hourly employees: ");
        int hourNum = scan.nextInt();
        Hourly[] hourlyArray1 = new Hourly[hourNum];
        for (int i = 0; i < hourlyArray1.length; i++) {
            System.out.println("Enter name:");
            String name = scan.next();
            System.out.println("Enter Address:");
            String address = scan.next();
            System.out.println("Enter phone number:");
            String number = scan.next();
            System.out.println("Enter Social Security:");
            String social = scan.next();
            System.out.println("Enter pay rate:");
            double pay = scan.nextDouble();
            System.out.println("Hours worked");
            int hoursWork = scan.nextInt();
            try {
                if (hoursWork > 40) {
                    throw new NoOvertimeException("Cannot work over 40 hours");
                }
                hourlyArray1[i] = new Hourly(name, address, number, social, pay);
                hourlyArray1[i].addHours(hoursWork);
            } catch (NoOvertimeException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }


        }

    }

}
