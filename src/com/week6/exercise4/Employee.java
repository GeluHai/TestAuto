/*
4. Create a class called Employee that includes three pieces of information as instance variables—
a first name (typeString), a last name (typeString) and a monthly salary (double).
Your class should have a constructor that initializes the three instance variables.
Provide a set and a get method for each instance variable.
If the monthly salary is not positive, set it to 0.0.
Write a test application named EmployeeTest that demonstrates class Employee’s capabilities.
Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

package exercise4;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    public void setMonthlySalary(double newMonthlySalary) {
        if(newMonthlySalary<0)
            monthlySalary = 0;
        else
            monthlySalary = newMonthlySalary;
    }

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
}
