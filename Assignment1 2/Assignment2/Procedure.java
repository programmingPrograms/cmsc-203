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

// Procedure class that holds info about a medical procedure.
public class Procedure {
    private String name;
    private String date;
    private String practitioner;
    private double charge;

    public Procedure() {
        name = "";
        date = "";
        practitioner = "";
        charge = 0.0;
    }

    public Procedure(String n, String d) {
        this();
        name = n;
        date = d;
    }

    public Procedure(String n, String d, String prac, double ch) {
        name = n;
        date = d;
        practitioner = prac;
        charge = ch;
    }

    public String getName() { return name; }
    public void setName(String n) { name = n; }

    public String getDate() { return date; }
    public void setDate(String d) { date = d; }

    public String getPractitioner() { return practitioner; }
    public void setPractitioner(String p) { practitioner = p; }

    public double getCharge() { return charge; }
    public void setCharge(double c) { charge = c; }

    public String toString() {
        return name + "\t" + date + "\t" + practitioner + "\t" + String.format("%.2f", charge);
    }
}
