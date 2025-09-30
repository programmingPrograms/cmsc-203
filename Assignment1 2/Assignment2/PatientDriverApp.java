/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Kevin Morales
*/

// Driver that tests Patient and Procedure classes.
import java.util.Scanner;

public class PatientDriverApp {
    public static void displayPatient(Patient p) {
        System.out.println(p.toString());
    }

    public static void displayProcedure(Procedure pr) {
        System.out.println(pr.toString());
    }

    public static double calculateTotalCharges(Procedure a, Procedure b, Procedure c) {
        return a.getCharge() + b.getCharge() + c.getCharge();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The program was developed by a Student: Kevin Morales " + java.time.LocalDate.now());
        System.out.println();

        System.out.print("Enter first name: ");
        String first = input.nextLine();
        System.out.print("Enter middle name: ");
        String mid = input.nextLine();
        System.out.print("Enter last name: ");
        String last = input.nextLine();
        System.out.print("Enter street: ");
        String addr = input.nextLine();
        System.out.print("Enter city: ");
        String city = input.nextLine();
        System.out.print("Enter state: ");
        String state = input.nextLine();
        System.out.print("Enter zip: ");
        String zip = input.nextLine();
        System.out.print("Enter phone: ");
        String phone = input.nextLine();
        System.out.print("Enter emergency contact name: ");
        String emName = input.nextLine();
        System.out.print("Enter emergency phone: ");
        String emPhone = input.nextLine();

        Patient pat = new Patient(first, mid, last, addr, city, state, zip, phone, emName, emPhone);

        System.out.println("\nEnter Procedure 1 info:");
        Procedure p1 = new Procedure();
        System.out.print("Name: ");
        p1.setName(input.nextLine());
        System.out.print("Date: ");
        p1.setDate(input.nextLine());
        System.out.print("Practitioner: ");
        p1.setPractitioner(input.nextLine());
        System.out.print("Charge: ");
        p1.setCharge(input.nextDouble());
        input.nextLine();

        System.out.println("\nEnter Procedure 2 info:");
        System.out.print("Name: ");
        String p2n = input.nextLine();
        System.out.print("Date: ");
        String p2d = input.nextLine();
        Procedure p2 = new Procedure(p2n, p2d);
        System.out.print("Practitioner: ");
        p2.setPractitioner(input.nextLine());
        System.out.print("Charge: ");
        p2.setCharge(input.nextDouble());
        input.nextLine();

        System.out.println("\nEnter Procedure 3 info:");
        System.out.print("Name: ");
        String p3n = input.nextLine();
        System.out.print("Date: ");
        String p3d = input.nextLine();
        System.out.print("Practitioner: ");
        String p3pr = input.nextLine();
        System.out.print("Charge: ");
        double p3c = input.nextDouble();
        Procedure p3 = new Procedure(p3n, p3d, p3pr, p3c);

        System.out.println();
        displayPatient(pat);
        System.out.println("\nProcedures:");
        displayProcedure(p1);
        displayProcedure(p2);
        displayProcedure(p3);

        double total = calculateTotalCharges(p1, p2, p3);
        System.out.printf("\nTotal charges: %,.2f\n", total);

        input.close();
    }
}
