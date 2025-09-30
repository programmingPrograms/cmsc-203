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

// Patient class that holds info about the patient.
public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String emergencyName;
    private String emergencyPhone;

    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zip = "";
        phone = "";
        emergencyName = "";
        emergencyPhone = "";
    }

    public Patient(String f, String m, String l) {
        this();
        firstName = f;
        middleName = m;
        lastName = l;
    }

    public Patient(String f, String m, String l,
                   String addr, String c, String st, String z,
                   String ph, String emName, String emPhone) {
        firstName = f;
        middleName = m;
        lastName = l;
        streetAddress = addr;
        city = c;
        state = st;
        zip = z;
        phone = ph;
        emergencyName = emName;
        emergencyPhone = emPhone;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String f) { firstName = f; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String m) { middleName = m; }

    public String getLastName() { return lastName; }
    public void setLastName(String l) { lastName = l; }

    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String a) { streetAddress = a; }

    public String getCity() { return city; }
    public void setCity(String c) { city = c; }

    public String getState() { return state; }
    public void setState(String s) { state = s; }

    public String getZip() { return zip; }
    public void setZip(String z) { zip = z; }

    public String getPhone() { return phone; }
    public void setPhone(String p) { phone = p; }

    public String getEmergencyName() { return emergencyName; }
    public void setEmergencyName(String en) { emergencyName = en; }

    public String getEmergencyPhone() { return emergencyPhone; }
    public void setEmergencyPhone(String ep) { emergencyPhone = ep; }

    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zip;
    }

    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone;
    }

    public String toString() {
        return "Patient Info:\n" +
               "Name: " + buildFullName() + "\n" +
               "Address: " + buildAddress() + "\n" +
               "Phone: " + phone + "\n" +
               "Emergency Contact: " + buildEmergencyContact();
    }
}
