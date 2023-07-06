import java.util.Scanner;

public class TestExceptionV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of hourly employees: ");
        int hourNum = scan.nextInt();
        Hourly[] hourlyArray1 = new Hourly[hourNum];
        double totalPay = 0;
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
            int hoursWorked = scan.nextInt();
            try {
                if (hoursWorked > 40) {
                    throw new NoOvertimeException("Cannot work over 40 hours");
                }
                hourlyArray1[i] = new Hourly(name, address, number, social, pay);
                hourlyArray1[i].addHours(hoursWorked);
            } catch (NoOvertimeException e) {
                System.out.println(e.getMessage());
                hourlyArray1[i] = new Hourly(name, address, number, social, pay);
                System.out.println("Enter valid hours worked:");
                int newHoursWorked = scan.nextInt();
                hourlyArray1[i].addHours(newHoursWorked);
            }
            System.out.print("Total hours worked:" + hourlyArray1[i].toString());
            totalPay = hourlyArray1[i].pay();
        }
        System.out.print("Total amount of workers" + hourlyArray1.length);
        System.out.println("Average pay:" + totalPay / hourlyArray1.length);

    }
}
